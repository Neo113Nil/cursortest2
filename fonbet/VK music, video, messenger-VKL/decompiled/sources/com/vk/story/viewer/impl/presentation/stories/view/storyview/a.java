package com.vk.story.viewer.impl.presentation.stories.view.storyview;

import com.vk.dto.narratives.Narrative;
import com.vk.im.engine.models.dialogs.Dialog;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;

/* compiled from: ShareTarget.kt */
/* loaded from: classes6.dex */
public interface a {

    /* compiled from: ShareTarget.kt */
    /* renamed from: com.vk.story.viewer.impl.presentation.stories.view.storyview.a$a, reason: collision with other inner class name */
    public static final class C1838a implements a {
        public static final C1838a a = new C1838a();
    }

    /* compiled from: ShareTarget.kt */
    public interface b extends a {

        /* compiled from: ShareTarget.kt */
        /* renamed from: com.vk.story.viewer.impl.presentation.stories.view.storyview.a$b$a, reason: collision with other inner class name */
        public interface InterfaceC1839a extends b {

            /* compiled from: ShareTarget.kt */
            /* renamed from: com.vk.story.viewer.impl.presentation.stories.view.storyview.a$b$a$a, reason: collision with other inner class name */
            public static final class C1840a implements InterfaceC1839a {
                public final long a;
                public final String b;
                public final String c;
                public final Dialog d;

                public C1840a(long j, String str, String str2, Dialog dialog) {
                    this.a = j;
                    this.b = str;
                    this.c = str2;
                    this.d = dialog;
                }

                @Override // com.vk.story.viewer.impl.presentation.stories.view.storyview.a.b
                public final String a() {
                    return this.c;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1840a)) {
                        return false;
                    }
                    C1840a c1840a = (C1840a) obj;
                    return this.a == c1840a.a && this.b.equals(c1840a.b) && this.c.equals(c1840a.c) && this.d.equals(c1840a.d);
                }

                @Override // com.vk.story.viewer.impl.presentation.stories.view.storyview.a.b.InterfaceC1839a
                public final long getId() {
                    return this.a;
                }

                @Override // com.vk.story.viewer.impl.presentation.stories.view.storyview.a.b
                public final String getName() {
                    return this.b;
                }

                public final int hashCode() {
                    return this.d.hashCode() + qoy.b(urd0.a(urd0.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, true);
                }

                public final String toString() {
                    return "Chat(id=" + this.a + ", name=" + this.b + ", avatarUrl=" + this.c + ", canSendMessage=true, dialog=" + this.d + ')';
                }

                @Override // com.vk.story.viewer.impl.presentation.stories.view.storyview.a.b.InterfaceC1839a
                public final Dialog x2() {
                    return this.d;
                }
            }

            /* compiled from: ShareTarget.kt */
            /* renamed from: com.vk.story.viewer.impl.presentation.stories.view.storyview.a$b$a$b, reason: collision with other inner class name */
            public static final class C1841b implements InterfaceC1839a {
                public final long a;
                public final String b;
                public final String c;
                public final Dialog d;

                public C1841b(long j, String str, String str2, Dialog dialog) {
                    this.a = j;
                    this.b = str;
                    this.c = str2;
                    this.d = dialog;
                }

                @Override // com.vk.story.viewer.impl.presentation.stories.view.storyview.a.b
                public final String a() {
                    return this.c;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1841b)) {
                        return false;
                    }
                    C1841b c1841b = (C1841b) obj;
                    return this.a == c1841b.a && this.b.equals(c1841b.b) && this.c.equals(c1841b.c) && this.d.equals(c1841b.d);
                }

                @Override // com.vk.story.viewer.impl.presentation.stories.view.storyview.a.b.InterfaceC1839a
                public final long getId() {
                    return this.a;
                }

                @Override // com.vk.story.viewer.impl.presentation.stories.view.storyview.a.b
                public final String getName() {
                    return this.b;
                }

                public final int hashCode() {
                    return this.d.hashCode() + qoy.b(urd0.a(urd0.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, true);
                }

                public final String toString() {
                    return "Contact(id=" + this.a + ", name=" + this.b + ", avatarUrl=" + this.c + ", canSendMessage=true, dialog=" + this.d + ')';
                }

                @Override // com.vk.story.viewer.impl.presentation.stories.view.storyview.a.b.InterfaceC1839a
                public final Dialog x2() {
                    return this.d;
                }
            }

            /* compiled from: ShareTarget.kt */
            /* renamed from: com.vk.story.viewer.impl.presentation.stories.view.storyview.a$b$a$c */
            public static final class c implements InterfaceC1839a {
                public final long a;
                public final String b;
                public final String c;
                public final Dialog d;

                public c(long j, String str, String str2, Dialog dialog) {
                    this.a = j;
                    this.b = str;
                    this.c = str2;
                    this.d = dialog;
                }

                @Override // com.vk.story.viewer.impl.presentation.stories.view.storyview.a.b
                public final String a() {
                    return this.c;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return this.a == cVar.a && this.b.equals(cVar.b) && this.c.equals(cVar.c) && this.d.equals(cVar.d);
                }

                @Override // com.vk.story.viewer.impl.presentation.stories.view.storyview.a.b.InterfaceC1839a
                public final long getId() {
                    return this.a;
                }

                @Override // com.vk.story.viewer.impl.presentation.stories.view.storyview.a.b
                public final String getName() {
                    return this.b;
                }

                public final int hashCode() {
                    return this.d.hashCode() + qoy.b(urd0.a(urd0.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, true);
                }

                public final String toString() {
                    return "Group(id=" + this.a + ", name=" + this.b + ", avatarUrl=" + this.c + ", canSendMessage=true, dialog=" + this.d + ')';
                }

                @Override // com.vk.story.viewer.impl.presentation.stories.view.storyview.a.b.InterfaceC1839a
                public final Dialog x2() {
                    return this.d;
                }
            }

            /* compiled from: ShareTarget.kt */
            /* renamed from: com.vk.story.viewer.impl.presentation.stories.view.storyview.a$b$a$d */
            public static final class d implements InterfaceC1839a {
                public final long a;
                public final String b;
                public final String c;
                public final String d;
                public final Dialog e;

                public d(long j, String str, String str2, String str3, Dialog dialog) {
                    this.a = j;
                    this.b = str;
                    this.c = str2;
                    this.d = str3;
                    this.e = dialog;
                }

                @Override // com.vk.story.viewer.impl.presentation.stories.view.storyview.a.b
                public final String a() {
                    return this.d;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return this.a == dVar.a && this.b.equals(dVar.b) && this.c.equals(dVar.c) && this.d.equals(dVar.d) && this.e.equals(dVar.e);
                }

                @Override // com.vk.story.viewer.impl.presentation.stories.view.storyview.a.b.InterfaceC1839a
                public final long getId() {
                    return this.a;
                }

                @Override // com.vk.story.viewer.impl.presentation.stories.view.storyview.a.b
                public final String getName() {
                    return this.b;
                }

                public final int hashCode() {
                    return this.e.hashCode() + qoy.b(urd0.a(urd0.a(urd0.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, true);
                }

                public final String toString() {
                    return "User(id=" + this.a + ", name=" + this.b + ", nameGen=" + this.c + ", avatarUrl=" + this.d + ", canSendMessage=true, dialog=" + this.e + ')';
                }

                @Override // com.vk.story.viewer.impl.presentation.stories.view.storyview.a.b.InterfaceC1839a
                public final Dialog x2() {
                    return this.e;
                }
            }

            long getId();

            Dialog x2();
        }

        /* compiled from: ShareTarget.kt */
        /* renamed from: com.vk.story.viewer.impl.presentation.stories.view.storyview.a$b$b, reason: collision with other inner class name */
        public static final class C1842b implements b {
            public final String a;
            public final String b;
            public final Narrative c;

            public C1842b(String str, String str2, Narrative narrative) {
                this.a = str;
                this.b = str2;
                this.c = narrative;
            }

            @Override // com.vk.story.viewer.impl.presentation.stories.view.storyview.a.b
            public final String a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1842b)) {
                    return false;
                }
                C1842b c1842b = (C1842b) obj;
                return epx.f(this.a, c1842b.a) && this.b.equals(c1842b.b) && this.c.equals(c1842b.c);
            }

            @Override // com.vk.story.viewer.impl.presentation.stories.view.storyview.a.b
            public final String getName() {
                return this.a;
            }

            public final int hashCode() {
                return this.c.hashCode() + qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, true);
            }

            public final String toString() {
                return "HighlightTarget(name=" + this.a + ", avatarUrl=" + this.b + ", canSendMessage=true, narrative=" + this.c + ')';
            }
        }

        String a();

        String getName();
    }
}
