package com.vk.feed.settings.impl.presentation.filtered;

import java.util.EnumMap;
import xsna.epx;
import xsna.xl50;

/* compiled from: NewsfeedFilteredSourcesPatch.kt */
/* loaded from: classes18.dex */
public abstract class c implements xl50 {

    /* compiled from: NewsfeedFilteredSourcesPatch.kt */
    public static final class a extends c {
        public static final a b = new a();
    }

    /* compiled from: NewsfeedFilteredSourcesPatch.kt */
    public static final class b extends c {
        public static final b b = new b();
    }

    /* compiled from: NewsfeedFilteredSourcesPatch.kt */
    /* renamed from: com.vk.feed.settings.impl.presentation.filtered.c$c, reason: collision with other inner class name */
    public static final class C1058c extends c {
        public final EnumMap b;

        public C1058c(EnumMap enumMap) {
            this.b = enumMap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1058c) && epx.f(this.b, ((C1058c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateTabs(counters=" + this.b + ')';
        }
    }
}
