package com.vk.clips.design.view.author;

import com.vk.core.tool.view.vkblur.VkBlurContentView;
import defpackage.q0;
import kotlin.collections.builders.ListBuilder;
import xsna.epx;
import xsna.gzs;
import xsna.hdu0;
import xsna.ho8;
import xsna.ndu0;
import xsna.qc;
import xsna.qoy;
import xsna.s3q0;
import xsna.s5;
import xsna.tlo0;
import xsna.uf3;

/* compiled from: ClipAuthorCellState.kt */
/* loaded from: classes16.dex */
public final class a {
    public final InterfaceC0555a a;
    public final c b;
    public final b c;
    public final d d;

    /* compiled from: ClipAuthorCellState.kt */
    /* renamed from: com.vk.clips.design.view.author.a$a, reason: collision with other inner class name */
    public interface InterfaceC0555a {

        /* compiled from: ClipAuthorCellState.kt */
        /* renamed from: com.vk.clips.design.view.author.a$a$a, reason: collision with other inner class name */
        public static final class C0556a implements InterfaceC0555a {
            public static final C0556a a = new C0556a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0556a);
            }

            public final int hashCode() {
                return 135464786;
            }

            public final String toString() {
                return "Hidden";
            }
        }

        /* compiled from: ClipAuthorCellState.kt */
        /* renamed from: com.vk.clips.design.view.author.a$a$b */
        public static final class b implements InterfaceC0555a {
            public final String a;
            public final hdu0 b;
            public final gzs<s3q0> c;

            public b() {
                this(null, null, null, 15);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                bVar.getClass();
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                hdu0 hdu0Var = this.b;
                int hashCode2 = (hashCode + (hdu0Var == null ? 0 : hdu0Var.hashCode())) * 31;
                gzs<s3q0> gzsVar = this.c;
                return hashCode2 + (gzsVar != null ? gzsVar.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Single(drawable=null, url=");
                sb.append(this.a);
                sb.append(", border=");
                sb.append(this.b);
                sb.append(", onClick=");
                return uf3.d(sb, this.c, ')');
            }

            public b(String str, ndu0 ndu0Var, qc qcVar, int i) {
                str = (i & 2) != 0 ? null : str;
                ndu0Var = (i & 4) != 0 ? null : ndu0Var;
                qcVar = (i & 8) != 0 ? null : qcVar;
                this.a = str;
                this.b = ndu0Var;
                this.c = qcVar;
            }
        }

        /* compiled from: ClipAuthorCellState.kt */
        /* renamed from: com.vk.clips.design.view.author.a$a$c */
        public static final class c implements InterfaceC0555a {
            public final String a;
            public final String b;
            public final gzs<s3q0> c;

            public c() {
                this(null, null, null, 31);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                cVar.getClass();
                return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                gzs<s3q0> gzsVar = this.c;
                return hashCode2 + (gzsVar != null ? gzsVar.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Stack(first=null, second=null, firstUrl=");
                sb.append(this.a);
                sb.append(", secondUrl=");
                sb.append(this.b);
                sb.append(", onClick=");
                return uf3.d(sb, this.c, ')');
            }

            public c(String str, String str2, s5 s5Var, int i) {
                str = (i & 4) != 0 ? null : str;
                str2 = (i & 8) != 0 ? null : str2;
                s5Var = (i & 16) != 0 ? null : s5Var;
                this.a = str;
                this.b = str2;
                this.c = s5Var;
            }
        }
    }

    /* compiled from: ClipAuthorCellState.kt */
    public static final class b {
        public final ListBuilder a;
        public final gzs<s3q0> b;

        /* compiled from: ClipAuthorCellState.kt */
        /* renamed from: com.vk.clips.design.view.author.a$b$a, reason: collision with other inner class name */
        public interface InterfaceC0557a {

            /* compiled from: ClipAuthorCellState.kt */
            /* renamed from: com.vk.clips.design.view.author.a$b$a$a, reason: collision with other inner class name */
            public static final class C0558a implements InterfaceC0557a {
                public final boolean a;

                public C0558a() {
                    this(0);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0558a) && this.a == ((C0558a) obj).a;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.a);
                }

                public final String toString() {
                    return q0.a(new StringBuilder("Equalizer(animating="), this.a, ')');
                }

                public C0558a(int i) {
                    this.a = true;
                }
            }

            /* compiled from: ClipAuthorCellState.kt */
            /* renamed from: com.vk.clips.design.view.author.a$b$a$b, reason: collision with other inner class name */
            public static final class C0559b implements InterfaceC0557a {
                public static final C0559b a = new C0559b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0559b);
                }

                public final int hashCode() {
                    return -1688932636;
                }

                public final String toString() {
                    return "Flash";
                }
            }

            /* compiled from: ClipAuthorCellState.kt */
            /* renamed from: com.vk.clips.design.view.author.a$b$a$c */
            public static final class c implements InterfaceC0557a {
                public static final c a = new c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return 1331233220;
                }

                public final String toString() {
                    return "None";
                }
            }
        }

        /* compiled from: ClipAuthorCellState.kt */
        /* renamed from: com.vk.clips.design.view.author.a$b$b, reason: collision with other inner class name */
        public static final class C0560b {
            public final tlo0.h a;
            public final InterfaceC0557a b;

            public C0560b(tlo0.h hVar, InterfaceC0557a interfaceC0557a) {
                this.a = hVar;
                this.b = interfaceC0557a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0560b)) {
                    return false;
                }
                C0560b c0560b = (C0560b) obj;
                return this.a.equals(c0560b.a) && epx.f(this.b, c0560b.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.a.hashCode() * 31);
            }

            public final String toString() {
                return "Item(text=" + this.a + ", icon=" + this.b + ')';
            }
        }

        public b(ListBuilder listBuilder, com.vk.newsfeed.posting.mediapicker.photovk.base.a aVar) {
            this.a = listBuilder;
            this.b = aVar;
            if (listBuilder.isEmpty()) {
                throw new IllegalArgumentException("Subtitle must have at least one item");
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            gzs<s3q0> gzsVar = this.b;
            return hashCode + (gzsVar == null ? 0 : gzsVar.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Subtitle(items=");
            sb.append(this.a);
            sb.append(", onClick=");
            return uf3.d(sb, this.b, ')');
        }
    }

    /* compiled from: ClipAuthorCellState.kt */
    public static final class c {
        public final tlo0 a;
        public final boolean b;
        public final String c;

        public c(tlo0 tlo0Var, boolean z, String str) {
            this.a = tlo0Var;
            this.b = z;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return b + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Title(text=");
            sb.append(this.a);
            sb.append(", verified=");
            sb.append(this.b);
            sb.append(", statusIconUrl=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: ClipAuthorCellState.kt */
    public interface d {

        /* compiled from: ClipAuthorCellState.kt */
        /* renamed from: com.vk.clips.design.view.author.a$d$a, reason: collision with other inner class name */
        public static final class C0561a implements d {
            public final tlo0.f a;
            public final InterfaceC0562a b;
            public final gzs<s3q0> c;

            /* compiled from: ClipAuthorCellState.kt */
            /* renamed from: com.vk.clips.design.view.author.a$d$a$a, reason: collision with other inner class name */
            public interface InterfaceC0562a {

                /* compiled from: ClipAuthorCellState.kt */
                /* renamed from: com.vk.clips.design.view.author.a$d$a$a$a, reason: collision with other inner class name */
                public static final class C0563a implements InterfaceC0562a {
                    public final VkBlurContentView a;

                    static {
                        int i = VkBlurContentView.f;
                    }

                    public C0563a(VkBlurContentView vkBlurContentView) {
                        this.a = vkBlurContentView;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C0563a) && epx.f(this.a, ((C0563a) obj).a);
                    }

                    public final int hashCode() {
                        return this.a.hashCode();
                    }

                    public final String toString() {
                        return "Blur(blurContentView=" + this.a + ')';
                    }
                }

                /* compiled from: ClipAuthorCellState.kt */
                /* renamed from: com.vk.clips.design.view.author.a$d$a$a$b */
                public static final class b implements InterfaceC0562a {
                    public static final b a = new b();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof b);
                    }

                    public final int hashCode() {
                        return 871506133;
                    }

                    public final String toString() {
                        return "Contrast";
                    }
                }
            }

            public C0561a(tlo0.f fVar, InterfaceC0562a interfaceC0562a, gzs gzsVar) {
                this.a = fVar;
                this.b = interfaceC0562a;
                this.c = gzsVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0561a)) {
                    return false;
                }
                C0561a c0561a = (C0561a) obj;
                return this.a.equals(c0561a.a) && epx.f(this.b, c0561a.b) && this.c.equals(c0561a.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a.a) * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Button(text=");
                sb.append(this.a);
                sb.append(", appearance=");
                sb.append(this.b);
                sb.append(", onClick=");
                return uf3.d(sb, this.c, ')');
            }
        }

        /* compiled from: ClipAuthorCellState.kt */
        public static final class b implements d {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                ((b) obj).getClass();
                return true;
            }

            public final int hashCode() {
                Object obj = null;
                obj.getClass();
                throw null;
            }

            public final String toString() {
                return "More(contentDescription=null, onClick=null)";
            }
        }
    }

    public a(InterfaceC0555a interfaceC0555a, c cVar, b bVar, d.C0561a c0561a) {
        this.a = interfaceC0555a;
        this.b = cVar;
        this.c = bVar;
        this.d = c0561a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        b bVar = this.c;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        d dVar = this.d;
        return hashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "ClipAuthorCellState(avatar=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", trailing=" + this.d + ')';
    }
}
