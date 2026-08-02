package com.vk.core.fragments;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.log.L;
import defpackage.q0;
import java.util.HashMap;
import java.util.Map;
import xsna.vbs;

/* compiled from: BottomFragmentHandler.kt */
/* loaded from: classes.dex */
public final class BottomFragmentHandler {
    public final vbs a;
    public final HashMap<FragmentEntry, FragmentEntry> b = new HashMap<>();

    public BottomFragmentHandler(vbs vbsVar) {
        this.a = vbsVar;
    }

    public final void a(FragmentImpl fragmentImpl, FragmentImpl fragmentImpl2, FragmentEntry fragmentEntry, boolean z, boolean z2) {
        FragmentEntry fragmentEntry2;
        FragmentImpl b;
        FragmentEntry Kn;
        FragmentEntry fragmentEntry3;
        FragmentImpl b2;
        StringBuilder sb = new StringBuilder("[fromFragment=");
        sb.append(fragmentImpl);
        sb.append(", toFragment=");
        sb.append(fragmentImpl2);
        sb.append(", currentEntry=");
        sb.append(fragmentEntry);
        sb.append(", isHidingCurrentEntry=");
        sb.append(z);
        sb.append(", isMovingForward=");
        String a = q0.a(sb, z2, ']');
        HashMap<FragmentEntry, FragmentEntry> hashMap = this.b;
        vbs vbsVar = this.a;
        if (fragmentImpl != null && (Kn = fragmentImpl.Kn()) != null && (fragmentEntry3 = hashMap.get(Kn)) != null && (b2 = b(fragmentEntry3)) != null) {
            if (b2.equals(fragmentImpl2)) {
                FragmentEntry Kn2 = fragmentImpl.Kn();
                L.e("Forget bottom entry " + Kn2 + ", navigation=" + a);
                hashMap.remove(Kn2);
            } else {
                L.e("Hide fragment " + b2 + ", navigation=" + a);
                vbsVar.i(b2, null, false);
            }
        }
        if (z) {
            return;
        }
        if (!z2) {
            FragmentEntry Kn3 = fragmentImpl2.Kn();
            if (Kn3 == null || (fragmentEntry2 = hashMap.get(Kn3)) == null || (b = b(fragmentEntry2)) == null) {
                return;
            }
            L.e("Show bottom fragment " + b + ", navigation=" + a);
            vbsVar.n(b, null, false);
            return;
        }
        FragmentEntry Kn4 = fragmentImpl2.Kn();
        if (Kn4 != null) {
            if (fragmentEntry == null) {
                L.e("Forget bottom entry " + fragmentEntry + ", navigation=" + a);
                hashMap.remove(Kn4);
                return;
            }
            L.e("Keep bottom entry " + fragmentEntry + ", navigation=" + a);
            hashMap.put(Kn4, fragmentEntry);
            FragmentImpl b3 = b(fragmentEntry);
            if (b3 != null) {
                b3.Hn();
            }
        }
    }

    public final FragmentImpl b(FragmentEntry fragmentEntry) {
        FragmentImpl zb = fragmentEntry.zb(this.a);
        if (!BuildInfo.h() || zb != null) {
            return zb;
        }
        throw new IllegalStateException("Fragment was required but not found for entry: " + fragmentEntry);
    }

    public final void c(Bundle bundle) {
        SavedState savedState;
        HashMap<FragmentEntry, FragmentEntry> d;
        try {
            savedState = (SavedState) com.vk.core.util.state.a.b(SavedState.class, bundle, "_bottom_fragment_handler_key_state");
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(new Serializer.DeserializationError("Error while unboxing state of BottomFragmentHandler", e));
            com.vk.core.util.state.a.b.d("_bottom_fragment_handler_key_state");
            savedState = null;
        }
        HashMap<FragmentEntry, FragmentEntry> hashMap = this.b;
        hashMap.clear();
        if (savedState != null && (d = savedState.d()) != null) {
            hashMap.putAll(d);
        }
        L.e("Restore state, association=" + hashMap);
    }

    public final void d(Bundle bundle) {
        StringBuilder sb = new StringBuilder("Save state, association=");
        HashMap<FragmentEntry, FragmentEntry> hashMap = this.b;
        sb.append(hashMap);
        L.e(sb.toString());
        com.vk.core.util.state.a.c(bundle, "_bottom_fragment_handler_key_state", new SavedState(hashMap));
    }

    /* compiled from: BottomFragmentHandler.kt */
    /* loaded from: classes17.dex */
    public static final class SavedState implements Parcelable {
        public static final a CREATOR = new a();
        public final HashMap<FragmentEntry, FragmentEntry> b;

        /* compiled from: BottomFragmentHandler.kt */
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(HashMap<FragmentEntry, FragmentEntry> hashMap) {
            this.b = hashMap;
        }

        public final HashMap<FragmentEntry, FragmentEntry> d() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            CREATOR.getClass();
            HashMap<FragmentEntry, FragmentEntry> hashMap = this.b;
            parcel.writeInt(hashMap.size());
            for (Map.Entry<FragmentEntry, FragmentEntry> entry : hashMap.entrySet()) {
                FragmentEntry key = entry.getKey();
                FragmentEntry value = entry.getValue();
                parcel.writeParcelable(key, i);
                parcel.writeParcelable(value, i);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public SavedState(Parcel parcel) {
            this((HashMap<FragmentEntry, FragmentEntry>) r1);
            CREATOR.getClass();
            int readInt = parcel.readInt();
            HashMap hashMap = new HashMap(readInt);
            ClassLoader classLoader = FragmentEntry.class.getClassLoader();
            for (int i = 0; i < readInt; i++) {
                hashMap.put(parcel.readParcelable(classLoader), parcel.readParcelable(classLoader));
            }
        }
    }
}
