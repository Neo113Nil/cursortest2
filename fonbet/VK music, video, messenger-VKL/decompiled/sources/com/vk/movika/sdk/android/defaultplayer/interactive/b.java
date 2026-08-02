package com.vk.movika.sdk.android.defaultplayer.interactive;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.TypefaceSpan;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.di.PhotoEditorComponentImpl;
import com.vk.attachpicker.impl.di.AttachPickerComponentImpl;
import com.vk.attachpicker.screen.j;
import com.vk.channelrestrictions.ChannelRestrictionsComponentImpl;
import com.vk.clips.design.view.filter.FiltersView;
import com.vk.clips.sdk.target.impl.di.MyTargetComponentImpl;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.core.store.entity.core.api.EntityCacheComponent;
import com.vk.im.engine.models.ButtonActionType;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import xsna.abg0;
import xsna.bmj;
import xsna.d44;
import xsna.dbg0;
import xsna.dhr0;
import xsna.dq50;
import xsna.e370;
import xsna.e43;
import xsna.fpf0;
import xsna.fxc0;
import xsna.gsm0;
import xsna.gx50;
import xsna.gzs;
import xsna.h0f;
import xsna.i0q0;
import xsna.iah0;
import xsna.k7m;
import xsna.kwl;
import xsna.l8g;
import xsna.la60;
import xsna.m7m;
import xsna.mz3;
import xsna.qcy;
import xsna.rl3;
import xsna.s3q0;
import xsna.v370;
import xsna.x9;
import xsna.y320;
import xsna.zzq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ b(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return Long.MAX_VALUE;
            case 1:
                return Executors.newScheduledThreadPool(1, new mz3());
            case 2:
                qcy<Object>[] qcyVarArr = AttachPickerComponentImpl.b;
                return new d44();
            case 3:
                throw new IllegalStateException("Provide event sink to consume author header events!");
            case 4:
                return ButtonActionType.h();
            case 5:
                qcy<Object>[] qcyVarArr2 = ChannelRestrictionsComponentImpl.c;
                return new bmj();
            case 6:
                return s3q0.a;
            case 7:
                return s3q0.a;
            case 8:
                return ((ClipsViewerComponent) ((k7m) m7m.f(h0f.b)).a(fpf0.a(ClipsViewerComponent.class))).pe();
            case 9:
                return new v370();
            case 10:
                return Boolean.valueOf(fxc0.B().J().X1());
            case 11:
                kwl.a.getClass();
                int argb = Color.argb(35, 30, 81, 134);
                int a = iah0.a(45);
                Bitmap createBitmap = Bitmap.createBitmap(a, a, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawARGB(0, 0, 0, 0);
                float width = canvas.getWidth() / 2.0f;
                Paint c = x9.c(true);
                abg0 abg0Var = dhr0.t;
                c.setColor(l8g.f(0.1f, abg0Var.c(R.attr.vk_ui_accent_blue)));
                float f = a / 2.0f;
                canvas.drawCircle(width, width, f, c);
                float a2 = f - iah0.a(14);
                c.setColor(abg0Var.c(R.attr.vk_ui_background_contrast));
                c.setShadowLayer(20.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, argb);
                canvas.drawCircle(width, width, a2, c);
                c.setColor(abg0Var.c(R.attr.vk_ui_icon_accent));
                c.clearShadowLayer();
                canvas.drawCircle(width, width, a2 - iah0.a(3), c);
                return createBitmap;
            case 12:
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(R.string.clip_description_expand));
                Context context2 = e43.a;
                Typeface a3 = dbg0.a(R.font.vk_roboto_medium, context2 != null ? context2 : null);
                if (a3 != null) {
                    spannableStringBuilder.setSpan(new TypefaceSpan(a3), 0, spannableStringBuilder.length(), 18);
                }
                return spannableStringBuilder;
            case 13:
                return s3q0.a;
            case 14:
                return s3q0.a;
            case 15:
                int i = FiltersView.x;
                return s3q0.a;
            case 16:
                return s3q0.a;
            case 17:
                return new zzq(false);
            case 18:
                return Boolean.valueOf(e370.s != null && com.vk.toggle.b.A.a(SaFeatures.SA_HANDLE_CAPTCHA_NATIVE));
            case 19:
                return ((EntityCacheComponent) ((k7m) m7m.f(y320.b)).a(fpf0.a(EntityCacheComponent.class))).Gb();
            case 20:
                return Preference.f("drafts");
            case 21:
                return MsgRequestStatus.h();
            case 22:
                qcy<Object>[] qcyVarArr3 = MyTargetComponentImpl.f;
                return new dq50();
            case 23:
                i0q0.e(new gx50());
                return s3q0.a;
            case 24:
                return new ArrayList();
            case 25:
                qcy<Object>[] qcyVarArr4 = NewsfeedFragment.J0;
                FeedFeatures feedFeatures = FeedFeatures.FRIEND_LIKES_INLINE;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 26:
                return !BuildInfo.h() ? new gsm0() : new gsm0();
            case 27:
                qcy<Object>[] qcyVarArr5 = PhotoEditorComponentImpl.e;
                return new j();
            case 28:
                return new la60();
            default:
                return rl3.y0(new Integer[]{10, 35});
        }
    }
}
