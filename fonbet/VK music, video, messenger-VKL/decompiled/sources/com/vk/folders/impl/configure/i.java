package com.vk.folders.impl.configure;

import java.util.List;
import xsna.wt90;
import xsna.yn50;
import xsna.yt90;

/* compiled from: FolderConfigurationViewEvent.kt */
/* loaded from: classes18.dex */
public abstract class i implements yn50 {

    /* compiled from: FolderConfigurationViewEvent.kt */
    public static final class a extends i {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1840833411;
        }

        public final String toString() {
            return "CheckLastVisiblePositionEvent";
        }
    }

    /* compiled from: FolderConfigurationViewEvent.kt */
    public static final class b extends i {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -326880135;
        }

        public final String toString() {
            return "CounterSettingsChangeError";
        }
    }

    /* compiled from: FolderConfigurationViewEvent.kt */
    public static final class c extends i {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1995734739;
        }

        public final String toString() {
            return "ShowHideFolderConfirm";
        }
    }

    /* compiled from: FolderConfigurationViewEvent.kt */
    public static final class d extends i {
        public final List<yt90> a;
        public final wt90 b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends yt90> list, wt90 wt90Var) {
            this.a = list;
            this.b = wt90Var;
        }
    }
}
