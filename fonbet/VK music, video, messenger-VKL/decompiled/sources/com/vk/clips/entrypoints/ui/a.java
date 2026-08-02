package com.vk.clips.entrypoints.ui;

import com.vk.mediastore.system.MediaStoreEntry;
import java.util.List;
import xsna.epx;
import xsna.kj50;
import xsna.l3e0;
import xsna.lbk;
import xsna.lpj;
import xsna.ms9;

/* compiled from: ClipsEntryPointsAction.kt */
/* loaded from: classes16.dex */
public abstract class a implements kj50 {

    /* compiled from: ClipsEntryPointsAction.kt */
    /* renamed from: com.vk.clips.entrypoints.ui.a$a, reason: collision with other inner class name */
    public static final class C0584a extends a {
        public static final C0584a b = new C0584a();
    }

    /* compiled from: ClipsEntryPointsAction.kt */
    public static final class b extends a {
        public static final b b = new b();
    }

    /* compiled from: ClipsEntryPointsAction.kt */
    public static final class c extends a {
        public static final c b = new c();
    }

    /* compiled from: ClipsEntryPointsAction.kt */
    public static final class d extends a {
        public static final d b = new d();
    }

    /* compiled from: ClipsEntryPointsAction.kt */
    public static final class e extends a {
        public final List<MediaStoreEntry> b;
        public final lpj c;
        public final lbk d;
        public final l3e0.a e;

        public e(List list, lpj lpjVar, lbk lbkVar, l3e0.a aVar) {
            this.b = list;
            this.c = lpjVar;
            this.d = lbkVar;
            this.e = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && epx.f(this.d, eVar.d) && epx.f(this.e, eVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "OnGalleryReady(entryList=" + this.b + ", context=" + this.c + ", sessionContextProvider=" + this.d + ", progressSettings=" + this.e + ')';
        }
    }

    /* compiled from: ClipsEntryPointsAction.kt */
    public static final class f extends a {
        public static final f b = new f();
    }

    /* compiled from: ClipsEntryPointsAction.kt */
    public static final class g extends a {
        public static final g b = new g();
    }

    /* compiled from: ClipsEntryPointsAction.kt */
    public static final class h extends a {
        public static final h b = new h();
    }

    /* compiled from: ClipsEntryPointsAction.kt */
    public static final class i extends a {
        public final List<MediaStoreEntry> b;

        /* JADX WARN: Multi-variable type inference failed */
        public i(List<? extends MediaStoreEntry> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("UpdateGallerySelectedItems(selectedItems="), this.b);
        }
    }
}
