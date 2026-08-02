package com.vk.music.informer.mvi;

import xsna.epx;
import xsna.ho8;

/* compiled from: MusicPlayerInformerNavigationEvent.kt */
/* loaded from: classes3.dex */
public interface g {

    /* compiled from: MusicPlayerInformerNavigationEvent.kt */
    public static final class a implements g {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Open(url="), this.a, ')');
        }
    }
}
