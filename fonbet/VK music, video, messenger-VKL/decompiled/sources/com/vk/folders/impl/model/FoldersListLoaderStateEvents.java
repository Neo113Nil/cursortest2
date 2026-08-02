package com.vk.folders.impl.model;

import io.reactivex.rxjava3.subjects.d;
import xsna.asp;
import xsna.zrp;

/* compiled from: FoldersListLoaderStateEvents.kt */
/* loaded from: classes18.dex */
public interface FoldersListLoaderStateEvents {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FoldersListLoaderStateEvents.kt */
    public static final class LoaderStateEvent {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LoaderStateEvent[] $VALUES;
        public static final LoaderStateEvent LoadingFinished;
        public static final LoaderStateEvent None;
        public static final LoaderStateEvent StartedLoading;

        static {
            LoaderStateEvent loaderStateEvent = new LoaderStateEvent("None", 0);
            None = loaderStateEvent;
            LoaderStateEvent loaderStateEvent2 = new LoaderStateEvent("StartedLoading", 1);
            StartedLoading = loaderStateEvent2;
            LoaderStateEvent loaderStateEvent3 = new LoaderStateEvent("LoadingFinished", 2);
            LoadingFinished = loaderStateEvent3;
            LoaderStateEvent[] loaderStateEventArr = {loaderStateEvent, loaderStateEvent2, loaderStateEvent3};
            $VALUES = loaderStateEventArr;
            $ENTRIES = new asp(loaderStateEventArr);
        }

        public LoaderStateEvent() {
            throw null;
        }

        public static LoaderStateEvent valueOf(String str) {
            return (LoaderStateEvent) Enum.valueOf(LoaderStateEvent.class, str);
        }

        public static LoaderStateEvent[] values() {
            return (LoaderStateEvent[]) $VALUES.clone();
        }
    }

    d i();
}
