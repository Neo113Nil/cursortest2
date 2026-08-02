package com.vk.clips.attachments.api.di;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.clips.attachments.api.publish.cta.ClipsCtaAttachEntryParams;
import com.vk.clips.attachments.api.publish.links.ClipsLinksAttachEntryParams;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import xsna.aae;
import xsna.dze;
import xsna.mgd;
import xsna.ood;
import xsna.qje;
import xsna.qod;

/* compiled from: ClipsAttachmentsComponentStub.kt */
/* loaded from: classes16.dex */
public final class b implements dze {
    public final mgd a = new mgd();
    public final c b = new c();
    public final a c = new a();
    public final C0543b d = new C0543b();

    /* compiled from: ClipsAttachmentsComponentStub.kt */
    /* renamed from: com.vk.clips.attachments.api.di.b$b, reason: collision with other inner class name */
    public static final class C0543b implements qod {
        @Override // xsna.qod
        public final x<Boolean> a(UserId userId, ClipInvolvementActionButton<?> clipInvolvementActionButton) {
            return x.k(Boolean.TRUE);
        }

        @Override // xsna.qod
        public final q<ClipInvolvementActionButton<?>> b(UserId userId) {
            return g0.b;
        }
    }

    @Override // xsna.dze
    public final qje a() {
        return this.b;
    }

    @Override // xsna.dze
    public final aae b() {
        return this.a;
    }

    @Override // xsna.dze
    public final ood c() {
        return this.c;
    }

    @Override // xsna.dze
    public final qod d() {
        return this.d;
    }

    /* compiled from: ClipsAttachmentsComponentStub.kt */
    public static final class c implements qje {
        @Override // xsna.qje
        public final void b(FragmentManager fragmentManager) {
        }

        @Override // xsna.qje
        public final void a(ClipsLinksAttachEntryParams clipsLinksAttachEntryParams, FragmentManager fragmentManager) {
        }
    }

    /* compiled from: ClipsAttachmentsComponentStub.kt */
    public static final class a implements ood {
        @Override // xsna.ood
        public final void a(ClipsCtaAttachEntryParams clipsCtaAttachEntryParams, Context context) {
        }
    }
}
