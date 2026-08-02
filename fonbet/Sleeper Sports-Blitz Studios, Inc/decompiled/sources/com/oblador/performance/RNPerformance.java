package com.oblador.performance;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public class RNPerformance {
    private static final List<MarkerListener> sListeners = new CopyOnWriteArrayList();
    private final Queue<PerformanceEntry> entries;

    interface MarkerListener {
        void logMarker(PerformanceEntry performanceEntry);
    }

    private RNPerformance() {
        this.entries = new ConcurrentLinkedQueue();
    }

    private static class LoadRNPerformance {
        static final RNPerformance instance = new RNPerformance();

        private LoadRNPerformance() {
        }
    }

    public static RNPerformance getInstance() {
        return LoadRNPerformance.instance;
    }

    protected void addListener(MarkerListener markerListener) {
        List<MarkerListener> list = sListeners;
        if (list.contains(markerListener)) {
            return;
        }
        list.add(markerListener);
    }

    protected void removeListener(MarkerListener markerListener) {
        List<MarkerListener> list = sListeners;
        if (list.contains(markerListener)) {
            return;
        }
        list.remove(markerListener);
    }

    public void mark(String str) {
        mark(str, true);
    }

    public void mark(String str, boolean z) {
        mark(str, null, z);
    }

    public void mark(String str, Bundle bundle) {
        mark(str, bundle, true);
    }

    public void mark(String str, Bundle bundle, boolean z) {
        addEntry(new PerformanceMark(str, SystemClock.uptimeMillis(), z, bundle));
    }

    public void metric(String str, double d) {
        metric(str, d, true);
    }

    public void metric(String str, double d, boolean z) {
        metric(str, d, null, z);
    }

    public void metric(String str, double d, Bundle bundle) {
        metric(str, d, bundle, true);
    }

    public void metric(String str, double d, Bundle bundle, boolean z) {
        addEntry(new PerformanceMetric(str, d, SystemClock.uptimeMillis(), z, bundle));
    }

    private void addEntry(PerformanceEntry performanceEntry) {
        this.entries.add(performanceEntry);
        emitMark(performanceEntry);
    }

    private void emitMark(PerformanceEntry performanceEntry) {
        Iterator<MarkerListener> it = sListeners.iterator();
        while (it.hasNext()) {
            it.next().logMarker(performanceEntry);
        }
    }

    protected Queue<PerformanceEntry> getEntries() {
        return this.entries;
    }

    protected void clearEntries() {
        this.entries.clear();
    }

    protected void clearEntries(String str) {
        Iterator<PerformanceEntry> it = this.entries.iterator();
        while (it.hasNext()) {
            if (it.next().getName().equals(str)) {
                it.remove();
            }
        }
    }

    protected void clearEphermalEntries() {
        if (sListeners.isEmpty()) {
            return;
        }
        Iterator<PerformanceEntry> it = this.entries.iterator();
        while (it.hasNext()) {
            if (it.next().isEphemeral()) {
                it.remove();
            }
        }
    }
}
