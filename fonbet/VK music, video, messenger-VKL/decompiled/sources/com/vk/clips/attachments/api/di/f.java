package com.vk.clips.attachments.api.di;

import xsna.kbk;

/* compiled from: ClipsVideoAttachmentStatController.kt */
/* loaded from: classes16.dex */
public interface f {

    /* compiled from: ClipsVideoAttachmentStatController.kt */
    public static abstract class a {
        public final String a;

        /* compiled from: ClipsVideoAttachmentStatController.kt */
        /* renamed from: com.vk.clips.attachments.api.di.f$a$a, reason: collision with other inner class name */
        public static final class C0544a extends a {
        }

        /* compiled from: ClipsVideoAttachmentStatController.kt */
        public static final class b extends a {
        }

        /* compiled from: ClipsVideoAttachmentStatController.kt */
        public static final class c extends a {
        }

        public a(String str) {
            this.a = str;
        }
    }

    /* compiled from: ClipsVideoAttachmentStatController.kt */
    public static abstract class b {
        public final Long a;
        public final Long b;
        public final boolean c;

        /* compiled from: ClipsVideoAttachmentStatController.kt */
        public static final class a extends b {
        }

        /* compiled from: ClipsVideoAttachmentStatController.kt */
        /* renamed from: com.vk.clips.attachments.api.di.f$b$b, reason: collision with other inner class name */
        public static final class C0545b extends b {
        }

        /* compiled from: ClipsVideoAttachmentStatController.kt */
        public static final class c extends b {
        }

        public b(Long l, Long l2, boolean z) {
            this.a = l;
            this.b = l2;
            this.c = z;
        }
    }

    void a(b bVar);

    void b(a aVar, kbk kbkVar);
}
