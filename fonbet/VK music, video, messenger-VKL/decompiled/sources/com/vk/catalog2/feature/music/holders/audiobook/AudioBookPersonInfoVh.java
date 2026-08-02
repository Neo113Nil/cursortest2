package com.vk.catalog2.feature.music.holders.audiobook;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.unity3d.services.UnityAdsConstants;
import com.vk.avatar.api.VKAvatarView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockAudioBookPerson;
import com.vk.catalog2.feature.music.dto.ui.UIBlockLegalNotice;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.audiobook.AudioBookPerson;
import com.vk.dto.music.audiobook.AudioBookPersonRole;
import com.vk.imageloader.view.VKOverlayImageView;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.abg0;
import xsna.b5a;
import xsna.bwt0;
import xsna.c5g;
import xsna.c98;
import xsna.cn70;
import xsna.cqi;
import xsna.dhr0;
import xsna.drm0;
import xsna.f4m;
import xsna.hh7;
import xsna.ho8;
import xsna.iah0;
import xsna.j0r;
import xsna.j5g;
import xsna.k1a0;
import xsna.ki4;
import xsna.mba;
import xsna.too0;

/* compiled from: AudioBookPersonInfoVh.kt */
/* loaded from: classes16.dex */
public final class AudioBookPersonInfoVh extends CatalogClickableViewHolder implements too0, View.OnClickListener {
    public VKOverlayImageView e;
    public VKAvatarView f;
    public VkButton g;
    public TextView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public TextView l;
    public TextView m;
    public Group n;
    public final hh7 o;
    public UIBlockAudioBookPerson p;

    /* compiled from: AudioBookPersonInfoVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioBookPersonRole.values().length];
            try {
                iArr[AudioBookPersonRole.AUTHOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioBookPersonRole.NARRATOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AudioBookPersonInfoVh(mba mbaVar, b5a b5aVar) {
        super(mbaVar, b5aVar);
        this.o = new hh7(60, 0);
    }

    @Override // xsna.too0
    public final void Ng() {
        AudioBookPerson audioBookPerson;
        Image image;
        VKAvatarView vKAvatarView = this.f;
        if (vKAvatarView != null) {
            vKAvatarView.setRound(true);
            vKAvatarView.y0(cn70.c(3), dhr0.t.c(R.attr.vk_ui_background_content));
        }
        UIBlockAudioBookPerson uIBlockAudioBookPerson = this.p;
        if (uIBlockAudioBookPerson == null || (audioBookPerson = uIBlockAudioBookPerson.y) == null || (image = audioBookPerson.e) == null || !image.b.isEmpty()) {
            return;
        }
        c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0111, code lost:
    
        if (xsna.drm0.N(r5) == false) goto L81;
     */
    @Override // com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(UIBlock uIBlock) {
        String str;
        AudioBookPerson audioBookPerson;
        List<AudioBookPersonRole> list;
        Context context;
        Context context2;
        String string;
        Context context3;
        if (uIBlock instanceof UIBlockAudioBookPerson) {
            UIBlockAudioBookPerson uIBlockAudioBookPerson = (UIBlockAudioBookPerson) uIBlock;
            AudioBookPerson audioBookPerson2 = uIBlockAudioBookPerson.y;
            this.p = uIBlockAudioBookPerson;
            c();
            TextView textView = this.h;
            if (textView != null) {
                textView.setText(audioBookPerson2.c);
            }
            TextView textView2 = this.i;
            boolean z = true;
            if (textView2 != null) {
                UIBlockAudioBookPerson uIBlockAudioBookPerson2 = this.p;
                if (uIBlockAudioBookPerson2 == null || (audioBookPerson = uIBlockAudioBookPerson2.y) == null || (list = audioBookPerson.f) == null) {
                    str = null;
                } else {
                    List<AudioBookPersonRole> list2 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        int i = a.$EnumSwitchMapping$0[((AudioBookPersonRole) it.next()).ordinal()];
                        if (i == 1) {
                            VKOverlayImageView vKOverlayImageView = this.e;
                            if (vKOverlayImageView != null && (context2 = vKOverlayImageView.getContext()) != null) {
                                string = context2.getString(R.string.audiobook_author);
                            }
                            string = null;
                        } else {
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            VKOverlayImageView vKOverlayImageView2 = this.e;
                            if (vKOverlayImageView2 != null && (context3 = vKOverlayImageView2.getContext()) != null) {
                                string = context3.getString(R.string.audiobook_narrator);
                            }
                            string = null;
                        }
                        arrayList.add(string);
                    }
                    StringBuilder sb = new StringBuilder(" ");
                    VKOverlayImageView vKOverlayImageView3 = this.e;
                    str = j5g.g0(arrayList, ho8.a(sb, (vKOverlayImageView3 == null || (context = vKOverlayImageView3.getContext()) == null) ? null : context.getString(R.string.dot_separator), ' '), null, null, 0, null, 62);
                }
                textView2.setText(str);
            }
            String str2 = audioBookPerson2.d;
            TextView textView3 = this.j;
            if (textView3 != null) {
                textView3.setText(str2);
                f4m.E(textView3, !(str2 == null || str2.length() == 0));
                if (f4m.h(textView3)) {
                    bwt0.l(textView3, 50L, new ki4(this, textView3, str2, 0), null);
                } else {
                    TextView textView4 = this.k;
                    if (textView4 != null) {
                        f4m.j(textView4);
                    }
                }
            }
            VkButton vkButton = this.g;
            if (vkButton != null) {
                vkButton.setVisibility(0);
            }
            UIBlockLegalNotice uIBlockLegalNotice = uIBlockAudioBookPerson.z;
            TextView textView5 = this.l;
            TextView textView6 = this.m;
            if (textView5 == null || textView6 == null) {
                return;
            }
            String str3 = uIBlockLegalNotice != null ? uIBlockLegalNotice.y : null;
            if (str3 != null && !drm0.N(str3)) {
                String str4 = uIBlockLegalNotice != null ? uIBlockLegalNotice.z : null;
                if (str4 != null) {
                }
            }
            z = false;
            textView5.setText(uIBlockLegalNotice != null ? uIBlockLegalNotice.y : null);
            textView6.setText(uIBlockLegalNotice != null ? uIBlockLegalNotice.z : null);
            Group group = this.n;
            if (group != null) {
                f4m.E(group, z);
            }
        }
    }

    public final void c() {
        AudioBookPerson audioBookPerson;
        AudioBookPerson audioBookPerson2;
        AudioBookPerson audioBookPerson3;
        Image image;
        ImageSize Cb;
        UIBlockAudioBookPerson uIBlockAudioBookPerson = this.p;
        String str = (uIBlockAudioBookPerson == null || (audioBookPerson3 = uIBlockAudioBookPerson.y) == null || (image = audioBookPerson3.e) == null || (Cb = image.Cb((int) iah0.b(108.0f), true, false)) == null) ? null : Cb.d.d;
        if (str != null) {
            VKOverlayImageView vKOverlayImageView = this.e;
            if (vKOverlayImageView != null) {
                vKOverlayImageView.o0(str, null);
            }
            VKAvatarView vKAvatarView = this.f;
            if (vKAvatarView != null) {
                vKAvatarView.load(str);
                return;
            }
            return;
        }
        VKOverlayImageView vKOverlayImageView2 = this.e;
        if (vKOverlayImageView2 != null) {
            bwt0.l(vKOverlayImageView2, 50L, new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(this, 7), null);
        }
        VKAvatarView vKAvatarView2 = this.f;
        if (vKAvatarView2 != null) {
            Context context = vKAvatarView2.getContext();
            UIBlockAudioBookPerson uIBlockAudioBookPerson2 = this.p;
            Integer valueOf = (uIBlockAudioBookPerson2 == null || (audioBookPerson2 = uIBlockAudioBookPerson2.y) == null) ? null : Integer.valueOf(audioBookPerson2.b);
            UIBlockAudioBookPerson uIBlockAudioBookPerson3 = this.p;
            String str2 = (uIBlockAudioBookPerson3 == null || (audioBookPerson = uIBlockAudioBookPerson3.y) == null) ? null : audioBookPerson.c;
            Typeface a2 = cqi.a(Font.Companion, FontFamily.MEDIUM, 13.0f, context);
            TextSizeUnit textSizeUnit = TextSizeUnit.SP;
            int a3 = iah0.a(108);
            Bitmap createBitmap = Bitmap.createBitmap(a3, a3, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            float f = a3;
            float f2 = f / 2.0f;
            paint.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, j5g.N0(k1a0.a(valueOf != null ? valueOf.intValue() : 0)), (float[]) null, Shader.TileMode.CLAMP));
            canvas.drawCircle(f2, f2, f2, paint);
            paint.setShader(null);
            paint.setColor(-1);
            paint.setTextSize(iah0.b(31.0f));
            paint.setAntiAlias(true);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(a2);
            Rect rect = new Rect();
            String g0 = (str2 == null || str2.length() == 0) ? "" : j5g.g0(drm0.c0(str2, new String[]{" "}, 2, 2), "", null, null, 0, new j0r(16), 30);
            paint.getTextBounds(g0, 0, g0.length(), rect);
            canvas.drawText(g0, f2, f2 - ((paint.ascent() + paint.descent()) / 2.0f), paint);
            VKAvatarView.Z0(vKAvatarView2, null, new BitmapDrawable(context.getResources(), createBitmap), null, null, 13);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_audiobook_person_info, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        VKOverlayImageView vKOverlayImageView = (VKOverlayImageView) constraintLayout.findViewById(R.id.background_top_half_image);
        bwt0.d(vKOverlayImageView, iah0.b(21.0f), true, false);
        vKOverlayImageView.setPostprocessor(this.o);
        this.e = vKOverlayImageView;
        VKOverlayImageView vKOverlayImageView2 = (VKOverlayImageView) constraintLayout.findViewById(R.id.background_bottom_half_image);
        bwt0.d(vKOverlayImageView2, iah0.b(20.0f), (r4 & 2) != 0, (r4 & 4) != 0);
        abg0 abg0Var = dhr0.t;
        vKOverlayImageView2.setBackgroundColor(abg0Var.c(R.attr.vk_ui_background_content));
        VKAvatarView vKAvatarView = (VKAvatarView) constraintLayout.findViewById(R.id.person_avatar);
        vKAvatarView.setRound(true);
        vKAvatarView.y0(cn70.c(3), abg0Var.c(R.attr.vk_ui_background_content));
        this.f = vKAvatarView;
        this.h = (TextView) constraintLayout.findViewById(R.id.name_tv);
        this.i = (TextView) constraintLayout.findViewById(R.id.role_tv);
        this.j = (TextView) constraintLayout.findViewById(R.id.description_tv);
        this.g = (VkButton) constraintLayout.findViewById(R.id.share_btn);
        this.k = (TextView) constraintLayout.findViewById(R.id.show_more_tv);
        this.l = (TextView) constraintLayout.findViewById(R.id.legal_title_tv);
        this.m = (TextView) constraintLayout.findViewById(R.id.legal_subtitle_tv);
        this.n = (Group) constraintLayout.findViewById(R.id.legal_notice_group);
        VkButton vkButton = this.g;
        if (vkButton != null) {
            vkButton.setOnClickListener(new c98(this, 1));
        }
        TextView textView = this.k;
        if (textView != null) {
            textView.setOnClickListener(new c98(this, 1));
        }
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
