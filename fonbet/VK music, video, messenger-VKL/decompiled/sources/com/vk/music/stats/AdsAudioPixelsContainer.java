package com.vk.music.stats;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.music.stats.AdsPixel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import xsna.pu0;
import xsna.zcl;

/* compiled from: AdsAudioPixelsContainer.kt */
/* loaded from: classes3.dex */
public final class AdsAudioPixelsContainer implements Serializer.StreamParcelable {
    public static final Serializer.c<AdsAudioPixelsContainer> CREATOR = new a();
    public final AdsTrackerState b;
    public final LinkedList<AdsPixel.Started> c;
    public final LinkedList<AdsPixel.Completed> d;
    public final PriorityQueue<AdsPixel.Reached> e;
    public final PriorityQueue<AdsPixel.Reached> f;
    public final ArrayList<AdsPixel.Secondary> g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AdsAudioPixelsContainer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AdsAudioPixelsContainer a(Serializer serializer) {
            AdsTrackerState adsTrackerState = (AdsTrackerState) serializer.G(AdsTrackerState.class.getClassLoader());
            if (adsTrackerState == null) {
                adsTrackerState = new AdsTrackerState(false, 1, null);
            }
            int u = serializer.u();
            int u2 = serializer.u();
            int u3 = serializer.u();
            int u4 = serializer.u();
            int u5 = serializer.u();
            AdsAudioPixelsContainer adsAudioPixelsContainer = new AdsAudioPixelsContainer(adsTrackerState);
            for (int i = 0; i < u; i++) {
                AdsPixel.Started started = (AdsPixel.Started) serializer.G(AdsPixel.Started.class.getClassLoader());
                if (started != null) {
                    adsAudioPixelsContainer.c.add(started);
                }
            }
            for (int i2 = 0; i2 < u2; i2++) {
                AdsPixel.Completed completed = (AdsPixel.Completed) serializer.G(AdsPixel.Completed.class.getClassLoader());
                if (completed != null) {
                    adsAudioPixelsContainer.d.add(completed);
                }
            }
            for (int i3 = 0; i3 < u3; i3++) {
                AdsPixel.Reached reached = (AdsPixel.Reached) serializer.G(AdsPixel.Reached.class.getClassLoader());
                if (reached != null) {
                    adsAudioPixelsContainer.e.add(reached);
                }
            }
            for (int i4 = 0; i4 < u4; i4++) {
                AdsPixel.Reached reached2 = (AdsPixel.Reached) serializer.G(AdsPixel.Reached.class.getClassLoader());
                if (reached2 != null) {
                    adsAudioPixelsContainer.f.add(reached2);
                }
            }
            for (int i5 = 0; i5 < u5; i5++) {
                AdsPixel.Secondary secondary = (AdsPixel.Secondary) serializer.G(AdsPixel.Secondary.class.getClassLoader());
                if (secondary != null) {
                    adsAudioPixelsContainer.g.add(secondary);
                }
            }
            return adsAudioPixelsContainer;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdsAudioPixelsContainer[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdsAudioPixelsContainer() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        LinkedList<AdsPixel.Started> linkedList = this.c;
        serializer.S(linkedList.size());
        LinkedList<AdsPixel.Completed> linkedList2 = this.d;
        serializer.S(linkedList2.size());
        PriorityQueue<AdsPixel.Reached> priorityQueue = this.e;
        serializer.S(priorityQueue.size());
        PriorityQueue<AdsPixel.Reached> priorityQueue2 = this.f;
        serializer.S(priorityQueue2.size());
        ArrayList<AdsPixel.Secondary> arrayList = this.g;
        serializer.S(arrayList.size());
        Iterator<T> it = linkedList.iterator();
        while (it.hasNext()) {
            serializer.i0((AdsPixel.Started) it.next());
        }
        Iterator<T> it2 = linkedList2.iterator();
        while (it2.hasNext()) {
            serializer.i0((AdsPixel.Completed) it2.next());
        }
        Iterator<AdsPixel.Reached> it3 = priorityQueue.iterator();
        while (it3.hasNext()) {
            serializer.i0(it3.next());
        }
        Iterator<AdsPixel.Reached> it4 = priorityQueue2.iterator();
        while (it4.hasNext()) {
            serializer.i0(it4.next());
        }
        Iterator<AdsPixel.Secondary> it5 = arrayList.iterator();
        while (it5.hasNext()) {
            serializer.i0(it5.next());
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public AdsAudioPixelsContainer(AdsTrackerState adsTrackerState) {
        this.b = adsTrackerState;
        pu0 pu0Var = new pu0();
        this.c = new LinkedList<>();
        this.d = new LinkedList<>();
        this.e = new PriorityQueue<>(pu0Var);
        this.f = new PriorityQueue<>(pu0Var);
        this.g = new ArrayList<>();
    }

    public /* synthetic */ AdsAudioPixelsContainer(AdsTrackerState adsTrackerState, int i, zcl zclVar) {
        this((i & 1) != 0 ? new AdsTrackerState(false, 1, null) : adsTrackerState);
    }
}
