package com.unity3d.ads.injection;

import xsna.dcy;
import xsna.epx;
import xsna.zcl;

/* compiled from: EntryKey.kt */
/* loaded from: classes14.dex */
public final class EntryKey {
    private final dcy<?> instanceClass;
    private final String named;

    public EntryKey(String str, dcy<?> dcyVar) {
        this.named = str;
        this.instanceClass = dcyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EntryKey copy$default(EntryKey entryKey, String str, dcy dcyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = entryKey.named;
        }
        if ((i & 2) != 0) {
            dcyVar = entryKey.instanceClass;
        }
        return entryKey.copy(str, dcyVar);
    }

    public final String component1() {
        return this.named;
    }

    public final dcy<?> component2() {
        return this.instanceClass;
    }

    public final EntryKey copy(String str, dcy<?> dcyVar) {
        return new EntryKey(str, dcyVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntryKey)) {
            return false;
        }
        EntryKey entryKey = (EntryKey) obj;
        return epx.f(this.named, entryKey.named) && epx.f(this.instanceClass, entryKey.instanceClass);
    }

    public final dcy<?> getInstanceClass() {
        return this.instanceClass;
    }

    public final String getNamed() {
        return this.named;
    }

    public int hashCode() {
        return this.instanceClass.hashCode() + (this.named.hashCode() * 31);
    }

    public String toString() {
        return "EntryKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }

    public /* synthetic */ EntryKey(String str, dcy dcyVar, int i, zcl zclVar) {
        this((i & 1) != 0 ? "" : str, dcyVar);
    }
}
