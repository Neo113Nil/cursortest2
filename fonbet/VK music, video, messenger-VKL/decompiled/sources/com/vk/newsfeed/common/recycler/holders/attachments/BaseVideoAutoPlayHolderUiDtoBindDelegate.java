package com.vk.newsfeed.common.recycler.holders.attachments;

import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.core.serialize.Serializer;
import com.vk.core.tool.view.RatioFrameLayout;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.newsfeed.Owner;
import com.vk.libvideo.ad.BaseAdsDataProvider;
import com.vk.libvideo.autoplay.b;
import kotlin.LazyThreadSafetyMode;
import xsna.cjx;
import xsna.fh5;
import xsna.hq6;
import xsna.msy;
import xsna.q8d;
import xsna.s4;
import xsna.xcs0;

/* compiled from: BaseVideoAutoPlayHolderUiDtoBindDelegate.kt */
/* loaded from: classes4.dex */
public final class BaseVideoAutoPlayHolderUiDtoBindDelegate {
    public final fh5 a;
    public final q8d b;
    public final ProgressBar c;
    public final FrescoImageView d;
    public final RatioFrameLayout e;
    public final xcs0 f;
    public final b g;
    public final Object h = msy.a(LazyThreadSafetyMode.NONE, new s4(this, 11));
    public cjx i;
    public hq6 j;

    public BaseVideoAutoPlayHolderUiDtoBindDelegate(fh5 fh5Var, q8d q8dVar, ProgressBar progressBar, FrescoImageView frescoImageView, RatioFrameLayout ratioFrameLayout, xcs0 xcs0Var, b bVar) {
        this.a = fh5Var;
        this.b = q8dVar;
        this.c = progressBar;
        this.d = frescoImageView;
        this.e = ratioFrameLayout;
        this.f = xcs0Var;
        this.g = bVar;
    }

    /* compiled from: BaseVideoAutoPlayHolderUiDtoBindDelegate.kt */
    public final class MyTargetAdsDataProvider extends BaseAdsDataProvider {
        public final Owner b;
        public final String c;
        public final String d;
        public final int e;
        public final String f;
        public final boolean g;

        public MyTargetAdsDataProvider(Owner owner, String str, String str2, int i, String str3, boolean z) {
            this.b = owner;
            this.c = str;
            this.d = str2;
            this.e = i;
            this.f = str3;
            this.g = z;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.i0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.S(this.e);
            serializer.j0(this.f);
        }

        @Override // com.vk.libvideo.api.ad.AdsDataProvider
        public final String S1() {
            return this.d;
        }

        @Override // com.vk.libvideo.api.ad.AdsDataProvider
        public final void a8(Context context) {
            boolean z = this.g;
            BaseVideoAutoPlayHolderUiDtoBindDelegate baseVideoAutoPlayHolderUiDtoBindDelegate = BaseVideoAutoPlayHolderUiDtoBindDelegate.this;
            if (z) {
                cjx cjxVar = baseVideoAutoPlayHolderUiDtoBindDelegate.i;
                if (cjxVar != null) {
                    cjxVar.p(new View(context), NativeAdContent.ViewTag.CTA);
                    return;
                }
                return;
            }
            hq6 hq6Var = baseVideoAutoPlayHolderUiDtoBindDelegate.j;
            if (hq6Var != null) {
                hq6Var.onClick(new View(context));
            }
        }

        @Override // com.vk.libvideo.api.ad.AdsDataProvider
        public final String getDescription() {
            return this.f;
        }

        @Override // com.vk.libvideo.api.ad.AdsDataProvider
        public final int getDuration() {
            return this.e;
        }

        @Override // com.vk.libvideo.api.ad.AdsDataProvider
        public final String getMessage() {
            return this.c;
        }

        @Override // com.vk.libvideo.api.ad.AdsDataProvider
        public final Owner s() {
            return this.b;
        }

        @Override // com.vk.libvideo.api.ad.AdsDataProvider
        public final void Da(FragmentActivity fragmentActivity) {
        }
    }
}
