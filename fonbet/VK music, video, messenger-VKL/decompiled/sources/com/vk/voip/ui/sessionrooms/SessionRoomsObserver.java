package com.vk.voip.ui.sessionrooms;

import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import xsna.asp;
import xsna.zrp;

/* compiled from: SessionRoomsObserver.kt */
/* loaded from: classes11.dex */
public interface SessionRoomsObserver {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SessionRoomsObserver.kt */
    /* loaded from: classes7.dex */
    public static final class ObserveRoomsScope {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ObserveRoomsScope[] $VALUES;
        public static final ObserveRoomsScope ALL;
        public static final ObserveRoomsScope AVAILABLE_FOR_TRANSITION;

        static {
            ObserveRoomsScope observeRoomsScope = new ObserveRoomsScope("ALL", 0);
            ALL = observeRoomsScope;
            ObserveRoomsScope observeRoomsScope2 = new ObserveRoomsScope("AVAILABLE_FOR_TRANSITION", 1);
            AVAILABLE_FOR_TRANSITION = observeRoomsScope2;
            ObserveRoomsScope[] observeRoomsScopeArr = {observeRoomsScope, observeRoomsScope2};
            $VALUES = observeRoomsScopeArr;
            $ENTRIES = new asp(observeRoomsScopeArr);
        }

        public ObserveRoomsScope() {
            throw null;
        }

        public static ObserveRoomsScope valueOf(String str) {
            return (ObserveRoomsScope) Enum.valueOf(ObserveRoomsScope.class, str);
        }

        public static ObserveRoomsScope[] values() {
            return (ObserveRoomsScope[]) $VALUES.clone();
        }
    }

    j1 a();

    q<f> b();

    io.reactivex.rxjava3.subjects.d h();
}
