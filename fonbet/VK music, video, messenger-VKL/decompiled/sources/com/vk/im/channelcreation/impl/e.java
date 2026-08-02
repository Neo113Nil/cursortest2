package com.vk.im.channelcreation.impl;

import java.util.ArrayList;
import xsna.epx;
import xsna.vu5;

/* compiled from: ChannelCreationPopup.kt */
/* loaded from: classes2.dex */
public abstract class e {

    /* compiled from: ChannelCreationPopup.kt */
    public static final class a extends e {
        public final ArrayList a;

        public a(ArrayList arrayList) {
            this.a = arrayList;
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
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("AvatarPicker(actions="), this.a);
        }
    }

    /* compiled from: ChannelCreationPopup.kt */
    public static final class b extends e {
        public static final b a = new b();
    }

    /* compiled from: ChannelCreationPopup.kt */
    public static final class c extends e {
        public static final c a = new c();
    }

    /* compiled from: ChannelCreationPopup.kt */
    public static final class d extends e {
        public static final d a = new d();
    }

    /* compiled from: ChannelCreationPopup.kt */
    /* renamed from: com.vk.im.channelcreation.impl.e$e, reason: collision with other inner class name */
    public static final class C1095e extends e {
        public static final C1095e a = new C1095e();
    }

    /* compiled from: ChannelCreationPopup.kt */
    public static final class f extends e {
        public final int a;

        public f(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Progress(message="), this.a, ')');
        }
    }
}
