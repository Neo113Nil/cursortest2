package com.vk.dto.stereo;

import xsna.epx;
import xsna.ho8;
import xsna.vu5;

/* compiled from: StereoRoomCover.kt */
/* loaded from: classes18.dex */
public interface a {

    /* compiled from: StereoRoomCover.kt */
    /* renamed from: com.vk.dto.stereo.a$a, reason: collision with other inner class name */
    public static final class C0914a implements a {
        public final int a;

        public C0914a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0914a) && this.a == ((C0914a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ColorCover(solidColor="), this.a, ')');
        }
    }

    /* compiled from: StereoRoomCover.kt */
    public static final class b {
        public static final C0914a a = new C0914a(-4076842);
    }

    /* compiled from: StereoRoomCover.kt */
    public static final class c implements a {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Photo(url="), this.a, ')');
        }
    }
}
