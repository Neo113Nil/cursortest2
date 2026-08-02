package com.vk.catalog2.feature.music.holders.artist;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.x;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.feature.music.dto.ui.MusicArtistChip;
import com.vk.catalog2.feature.music.dto.ui.MusicArtistInfo;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicArtistNew;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPage;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.ui.utils.TitleColorAttr;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.Artist;
import com.vk.imageloader.view.VKImageView;
import com.vk.imageloader.view.VKOverlayImageView;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayState;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.e;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioArtistClickItem;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.amt;
import xsna.asp;
import xsna.b5a;
import xsna.bh10;
import xsna.bjc;
import xsna.brj0;
import xsna.bwt0;
import xsna.c98;
import xsna.cfp0;
import xsna.dw20;
import xsna.e3m;
import xsna.enj;
import xsna.epx;
import xsna.g5g;
import xsna.ho8;
import xsna.i0q0;
import xsna.i3r;
import xsna.iah0;
import xsna.ir40;
import xsna.j5g;
import xsna.jnj;
import xsna.kbj0;
import xsna.lxz;
import xsna.mba;
import xsna.oh3;
import xsna.p010;
import xsna.qg6;
import xsna.s520;
import xsna.tf3;
import xsna.u2b0;
import xsna.uqm0;
import xsna.v1v;
import xsna.vw4;
import xsna.zo8;
import xsna.zrp;

/* compiled from: MusicPageInfoBlockNewVh.kt */
/* loaded from: classes16.dex */
public abstract class MusicPageInfoBlockNewVh implements CatalogViewHolder, View.OnClickListener {
    public final u2b0 b;
    public final b5a c;
    public final SearchStatInfoProvider d;
    public final MusicPlaybackLaunchContext e;
    public final mba f;
    public final kbj0 g;
    public VKImageView h;
    public TextView i;
    public View j;
    public View k;
    public RecyclerView l;
    public int m;
    public TextView n;
    public UIBlockMusicArtistNew o;
    public io.reactivex.rxjava3.disposables.c p;
    public dw20 q;
    public Drawable s;
    public Drawable t;
    public List<MusicArtistInfo> r = EmptyList.b;
    public final int u = R.drawable.vk_icon_play_24;
    public final e v = new e(this, new p010(this, 11));
    public final j w = new j();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MusicPageInfoBlockNewVh.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ACTION;
        public static final a MIX;
        public static final a SHARE;
        public static final a SHUFFLE;

        static {
            a aVar = new a("MIX", 0);
            MIX = aVar;
            a aVar2 = new a("SHARE", 1);
            SHARE = aVar2;
            a aVar3 = new a("SHUFFLE", 2);
            SHUFFLE = aVar3;
            a aVar4 = new a("ACTION", 3);
            ACTION = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: MusicPageInfoBlockNewVh.kt */
    public static final class b extends m.e<d> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(d dVar, d dVar2) {
            return dVar.equals(dVar2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(d dVar, d dVar2) {
            return dVar.e == dVar2.e;
        }
    }

    /* compiled from: MusicPageInfoBlockNewVh.kt */
    public static final class c extends RecyclerView.n {
        public final int b;

        public c(int i) {
            this.b = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            if (recyclerView.getChildAdapterPosition(view) > 0) {
                rect.left = this.b;
            }
        }
    }

    /* compiled from: MusicPageInfoBlockNewVh.kt */
    public static final class d {
        public final String a;
        public final Integer b;
        public final a c;
        public final UIBlockAction d;
        public final long e;
        public final g f;
        public final String g;

        public /* synthetic */ d(String str, Integer num, a aVar, long j) {
            this(str, num, aVar, null, j, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && this.c == dVar.c && epx.f(this.d, dVar.d) && this.e == dVar.e && epx.f(this.f, dVar.f) && epx.f(this.g, dVar.g);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            int hashCode2 = (this.c.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31;
            UIBlockAction uIBlockAction = this.d;
            int a = bh10.a((hashCode2 + (uIBlockAction == null ? 0 : uIBlockAction.hashCode())) * 31, 31, this.e);
            g gVar = this.f;
            int hashCode3 = (a + (gVar == null ? 0 : gVar.hashCode())) * 31;
            String str = this.g;
            return hashCode3 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ArtistChipModel(title=");
            sb.append(this.a);
            sb.append(", iconRes=");
            sb.append(this.b);
            sb.append(", clickType=");
            sb.append(this.c);
            sb.append(", action=");
            sb.append(this.d);
            sb.append(", stableId=");
            sb.append(this.e);
            sb.append(", mixData=");
            sb.append(this.f);
            sb.append(", trackCode=");
            return ho8.a(sb, this.g, ')');
        }

        public d(String str, Integer num, a aVar, UIBlockAction uIBlockAction, long j, g gVar, String str2) {
            this.a = str;
            this.b = num;
            this.c = aVar;
            this.d = uIBlockAction;
            this.e = j;
            this.f = gVar;
            this.g = str2;
        }
    }

    /* compiled from: MusicPageInfoBlockNewVh.kt */
    public final class e extends x<d, a> {
        public final p010 c;

        /* compiled from: MusicPageInfoBlockNewVh.kt */
        public final class a extends RecyclerView.e0 {
            public final VkButton l;
            public final int m;
            public final int n;

            public a(VkButton vkButton, View view) {
                super(view);
                this.l = vkButton;
                int a = e3m.a(R.dimen.catalog_artist_chip_min_height, vkButton.getContext());
                this.m = e3m.a(R.dimen.catalog_artist_chip_icon_size, vkButton.getContext());
                int color = vkButton.getContext().getColor(R.color.vk_white);
                this.n = color;
                int a2 = e3m.a(R.dimen.catalog_artist_chip_padding_start, vkButton.getContext());
                int a3 = e3m.a(R.dimen.catalog_artist_chip_padding_end, vkButton.getContext());
                int a4 = e3m.a(R.dimen.catalog_artist_chip_padding_top, vkButton.getContext());
                int a5 = e3m.a(R.dimen.catalog_artist_chip_padding_bottom, vkButton.getContext());
                vkButton.setMinimumHeight(a);
                vkButton.setPadding(a2, a4, a3, a5);
                vkButton.setTextTint(ColorStateList.valueOf(color));
                vkButton.setIconTint(ColorStateList.valueOf(color));
                vkButton.setMode(VkButton.Mode.Primary);
                vkButton.setAppearance(VkButton.Appearance.Overlay);
                vkButton.setSize(VkButton.Size.Small);
                vkButton.setIconColorful(false);
                vkButton.setTextColorful(false);
                vkButton.setBackgroundColorful(false);
                vkButton.setPadding(a2, a4, a3, a5);
            }
        }

        public e(MusicPageInfoBlockNewVh musicPageInfoBlockNewVh, p010 p010Var) {
            super(new b());
            this.c = p010Var;
            setHasStableIds(true);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i) {
            return getItem(i).e;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            a aVar = (a) e0Var;
            d item = getItem(i);
            int i2 = aVar.n;
            VkButton vkButton = aVar.l;
            vkButton.setText(item.a);
            vkButton.setIconSize(Integer.valueOf(aVar.m));
            vkButton.a5(true, null);
            Integer num = item.b;
            if (num != null) {
                vkButton.a5(false, Integer.valueOf(num.intValue()));
            }
            vkButton.setTextTint(ColorStateList.valueOf(i2));
            vkButton.setIconTint(ColorStateList.valueOf(i2));
            vkButton.setMode(VkButton.Mode.Primary);
            vkButton.setAppearance(VkButton.Appearance.Overlay);
            vkButton.setOnClickListener(new c98(new qg6(2, e.this, item), 1));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            View b = tf3.b(viewGroup, R.layout.catalog_artist_chip_item, viewGroup, false);
            return new a((VkButton) b.findViewById(R.id.artist_chip_button), b);
        }
    }

    /* compiled from: MusicPageInfoBlockNewVh.kt */
    public static final class f {
        public static long a(String str, a aVar, UIBlockAction uIBlockAction, g gVar) {
            return ((((aVar.hashCode() + (str.hashCode() * 31)) * 31) + (uIBlockAction != null ? uIBlockAction.hashCode() : 0)) * 31) + (gVar != null ? gVar.hashCode() : 0);
        }
    }

    /* compiled from: MusicPageInfoBlockNewVh.kt */
    public static final class g {
        public final String a;
        public final String b;
        public final String c;

        public g(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ArtistMixData(mixId=");
            sb.append(this.a);
            sb.append(", trackCode=");
            sb.append(this.b);
            sb.append(", entityId=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: MusicPageInfoBlockNewVh.kt */
    public static final class h extends ImageSpan {
        public final int b;

        public h(Drawable drawable, int i) {
            super(drawable, 2);
            this.b = i;
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            super.draw(canvas, charSequence, i, i2, f + this.b, i3, i4, i5, paint);
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            return super.getSize(paint, charSequence, i, i2, fontMetricsInt) + this.b;
        }
    }

    /* compiled from: MusicPageInfoBlockNewVh.kt */
    public static final /* synthetic */ class i {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.SHARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.MIX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.SHUFFLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.ACTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MusicPageInfoBlockNewVh.kt */
    public static final class j extends e.a {
        public j() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            MusicPageInfoBlockNewVh.this.h();
        }
    }

    public MusicPageInfoBlockNewVh(u2b0 u2b0Var, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, MusicPlaybackLaunchContext musicPlaybackLaunchContext, mba mbaVar, kbj0 kbj0Var) {
        this.b = u2b0Var;
        this.c = b5aVar;
        this.d = searchStatInfoProvider;
        this.e = musicPlaybackLaunchContext;
        this.f = mbaVar;
        this.g = kbj0Var;
    }

    public static void c(CommonAudioStat$TypeAudioArtistClickItem.EventType eventType, String str) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.MUSICIAN_CARD;
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
        if (str == null) {
            str = "";
        }
        new bjc(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeClick.a.b(schemeStat$EventItem, new CommonAudioStat$TypeAudioArtistClickItem(new CommonStat$TypeTrackCodeItem(str), CommonAudioStat$TypeAudioArtistClickItem.RefSource.AUDIO_ARTIST_HEADER, eventType), 2)).q();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void L() {
        io.reactivex.rxjava3.disposables.c cVar = this.p;
        if (cVar != null) {
            cVar.dispose();
        }
        this.p = null;
        dw20 dw20Var = this.q;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        this.q = null;
        this.b.n0(this.w);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (xsna.epx.f(r0 != null ? r0.c : null, (r3 == null || (r5 = r3.C) == null || (r5 = (com.vk.catalog2.feature.music.dto.ui.MusicArtistInfo) xsna.j5g.a0(r5)) == null) ? null : r5.c) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0180, code lost:
    
        if (r1.h == r5.h) goto L103;
     */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void N6(UIBlock uIBlock) {
        UIBlockMusicArtistNew uIBlockMusicArtistNew;
        int i2;
        RecyclerView recyclerView;
        boolean z;
        Iterator it;
        d dVar;
        ImageSize Cb;
        Image image;
        ImageSize Cb2;
        String str;
        Artist artist;
        UIBlockMusicArtistNew uIBlockMusicArtistNew2 = uIBlock instanceof UIBlockMusicArtistNew ? (UIBlockMusicArtistNew) uIBlock : null;
        if (uIBlockMusicArtistNew2 == null) {
            return;
        }
        if (!uIBlockMusicArtistNew2.C.isEmpty()) {
            this.r = uIBlockMusicArtistNew2.C;
        }
        if (!uIBlockMusicArtistNew2.C.isEmpty() || this.r.isEmpty()) {
            uIBlockMusicArtistNew = uIBlockMusicArtistNew2;
        } else {
            UIBlockMusicArtistNew zb = uIBlockMusicArtistNew2.zb();
            zb.C = this.r;
            uIBlockMusicArtistNew = zb;
        }
        UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock = uIBlockMusicArtistNew.y;
        Artist artist2 = uIBlockMusicArtistNew.z;
        UIBlockMusicArtistNew uIBlockMusicArtistNew3 = this.o;
        this.o = uIBlockMusicArtistNew;
        boolean z2 = true;
        int i3 = 0;
        if (epx.f(uIBlockMusicArtistNew2.getName(), uIBlockMusicArtistNew3 != null ? uIBlockMusicArtistNew3.getName() : null)) {
            MusicArtistInfo musicArtistInfo = (MusicArtistInfo) j5g.a0(uIBlockMusicArtistNew.C);
        }
        MusicArtistInfo musicArtistInfo2 = (MusicArtistInfo) j5g.a0(uIBlockMusicArtistNew.C);
        boolean f2 = musicArtistInfo2 != null ? epx.f(musicArtistInfo2.c, Boolean.TRUE) : false;
        TextView textView = this.n;
        if (textView != null) {
            if (f2) {
                Drawable drawable = textView.getContext().getDrawable(R.drawable.vk_icon_error_circle_16);
                Drawable mutate = drawable != null ? drawable.mutate() : null;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String name = uIBlockMusicArtistNew.getName();
                if (name == null) {
                    name = "";
                }
                spannableStringBuilder.append((CharSequence) name);
                if (mutate != null) {
                    mutate.setTint(e3m.f(R.attr.vk_ui_background_contrast_secondary_alpha, textView.getContext()));
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    h hVar = new h(mutate, iah0.a(4));
                    spannableStringBuilder.append((CharSequence) " ");
                    spannableStringBuilder.setSpan(hVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                }
                textView.setText(spannableStringBuilder);
            } else {
                textView.setText(uIBlockMusicArtistNew.getName());
            }
        }
        if (!epx.f(artist2.n, (uIBlockMusicArtistNew3 == null || (artist = uIBlockMusicArtistNew3.z) == null) ? null : artist.n)) {
            TextView textView2 = this.i;
            TextView textView3 = textView2 != null ? textView2 : null;
            Integer num = artist2.n;
            if (textView2 == null) {
                textView2 = null;
            }
            Context context = textView2.getContext();
            if (num == null || num.intValue() <= 0) {
                str = null;
            } else {
                String f3 = uqm0.f(num.intValue());
                int intValue = num.intValue();
                Resources resources = context.getResources();
                str = v1v.a(' ', f3, intValue >= 1000 ? resources.getQuantityString(R.plurals.listeners_of_artist, 1000) : resources.getQuantityString(R.plurals.listeners_of_artist, intValue));
            }
            textView3.setText(str);
            TextView textView4 = this.i;
            TextView textView5 = textView4 != null ? textView4 : null;
            if (textView4 == null) {
                textView4 = null;
            }
            CharSequence text = textView4.getText();
            bwt0.p0(textView5, !(text == null || text.length() == 0));
        }
        if (uIBlockMusicArtistNew3 != null) {
            boolean z3 = artist2.i;
            Artist artist3 = uIBlockMusicArtistNew3.z;
            if (z3 == artist3.i) {
            }
        }
        j(artist2.i, artist2.h);
        VKImageView vKImageView = this.h;
        if (vKImageView == null) {
            vKImageView = null;
        }
        if (vKImageView.getWidth() > 0) {
            VKImageView vKImageView2 = this.h;
            if (vKImageView2 == null) {
                vKImageView2 = null;
            }
            i2 = vKImageView2.getWidth();
        } else {
            i2 = this.m;
        }
        String str2 = (uIBlockMusicArtistNew3 == null || (image = uIBlockMusicArtistNew3.z.f) == null || (Cb2 = image.Cb(i2, true, false)) == null) ? null : Cb2.d.d;
        Image image2 = artist2.f;
        String str3 = (image2 == null || (Cb = image2.Cb(i2, true, false)) == null) ? null : Cb.d.d;
        if (!epx.f(str2, str3)) {
            if (str3 != null) {
                VKImageView vKImageView3 = this.h;
                if (vKImageView3 == null) {
                    vKImageView3 = null;
                }
                vKImageView3.s0(str3);
            }
            VKImageView vKImageView4 = this.h;
            if (vKImageView4 == null) {
                vKImageView4 = null;
            }
            VKOverlayImageView vKOverlayImageView = vKImageView4 instanceof VKOverlayImageView ? (VKOverlayImageView) vKImageView4 : null;
            if (vKOverlayImageView != null) {
                vKOverlayImageView.post(new ir40(this, new LayerDrawable(new Drawable[]{new ColorDrawable(335544320), new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1627389952, 520093696, 0}), new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-872415232, 0})}), vKOverlayImageView, i3));
            }
        }
        h();
        View view = this.k;
        if (view == null) {
            view = null;
        }
        view.setVisibility(uIBlockActionPlayAudiosFromBlock != null ? 0 : 4);
        RecyclerView recyclerView2 = this.l;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        Context context2 = recyclerView2.getContext();
        e eVar = this.v;
        List<d> currentList = eVar.getCurrentList();
        vw4 vw4Var = new vw4(1, this, MusicPageInfoBlockNewVh.class, "resolveChipIcon", "resolveChipIcon(Ljava/lang/String;)Ljava/lang/Integer;", 0, 9);
        List<MusicArtistInfo> list = uIBlockMusicArtistNew.C;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            g5g.y(((MusicArtistInfo) it2.next()).b, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            MusicArtistChip musicArtistChip = (MusicArtistChip) it3.next();
            String str4 = musicArtistChip.b;
            String str5 = musicArtistChip.c;
            if (str4 == null) {
                it = it3;
                z = z2;
                dVar = null;
            } else {
                z = z2;
                UIBlockAction uIBlockAction = musicArtistChip.d;
                boolean z4 = uIBlockAction instanceof UIBlockActionPlayAudiosFromBlock;
                a aVar = (z4 && ((UIBlockActionPlayAudiosFromBlock) uIBlockAction).B) ? a.SHUFFLE : z4 ? a.MIX : epx.f(str5, "shuffle_outline_20") ? a.SHUFFLE : epx.f(str5, "music_note_wave_outline_20") ? a.MIX : epx.f(str5, "share_outline_20") ? a.SHARE : a.ACTION;
                String str6 = musicArtistChip.f;
                String str7 = musicArtistChip.e;
                String str8 = musicArtistChip.g;
                g gVar = new g(str6, str7, str8);
                Integer num2 = (Integer) vw4Var.invoke(str5);
                String str9 = musicArtistChip.e;
                UIBlockAction uIBlockAction2 = musicArtistChip.d;
                it = it3;
                dVar = new d(str4, num2, aVar, uIBlockAction2, gVar.hashCode() + ((((aVar.hashCode() + (str4.hashCode() * 31)) * 31) + (uIBlockAction2 != null ? uIBlockAction2.hashCode() : 0)) * 31), ((str6 == null || str6.length() == 0) && (str7 == null || str7.length() == 0) && (str8 == null || str8.length() == 0)) ? null : gVar, str9);
            }
            if (dVar != null) {
                arrayList2.add(dVar);
            }
            z2 = z;
            it3 = it;
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = new ArrayList();
            String string = context2.getString(R.string.share);
            Integer num3 = (Integer) vw4Var.invoke("share_outline_20");
            a aVar2 = a.SHARE;
            recyclerView = null;
            arrayList2.add(new d(string, num3, aVar2, f.a(string, aVar2, null, null)));
            if (uIBlockActionPlayAudiosFromBlock != null) {
                String string2 = context2.getString(R.string.music_playlist_controls_shuffle);
                Integer num4 = (Integer) vw4Var.invoke("shuffle_outline_20");
                a aVar3 = a.SHUFFLE;
                arrayList2.add(new d(string2, num4, aVar3, f.a(string2, aVar3, null, null)));
            }
        } else {
            recyclerView = null;
        }
        if (!currentList.equals(arrayList2)) {
            eVar.submitList(arrayList2);
        }
        RecyclerView recyclerView3 = this.l;
        bwt0.p0(recyclerView3 == null ? recyclerView : recyclerView3, !arrayList2.isEmpty());
    }

    public abstract q<Integer> a(UIBlockMusicPage uIBlockMusicPage);

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
    
        if (r7 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
    
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
    
        r3.Pb(r4);
        r20.b.N0(new xsna.lqk0(new com.vk.music.player.StartPlayCatalogSource(r5, r21.c, null, null, false, null, 60, null), (com.vk.dto.music.MusicTrack) null, (java.util.List) null, r3, 0, r14, com.vk.music.player.PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (com.vk.music.stats.AdsAudioPixelsContainer) null, 0, 822));
        r20.c.a(new xsna.cfp0(r21, new com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo(r2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b8, code lost:
    
        if (r7 == null) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(UIBlockMusicArtistNew uIBlockMusicArtistNew, boolean z) {
        String str;
        Object obj;
        MusicAnalyticsInfo.ClickTarget clickTarget = MusicAnalyticsInfo.ClickTarget.PlayAll;
        UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock = uIBlockMusicArtistNew.y;
        if (uIBlockActionPlayAudiosFromBlock == null || (r5 = uIBlockActionPlayAudiosFromBlock.z) == null) {
            return;
        }
        boolean z2 = true;
        if (!z && !uIBlockActionPlayAudiosFromBlock.B) {
            z2 = false;
        }
        SearchStatInfoProvider searchStatInfoProvider = this.d;
        boolean a2 = searchStatInfoProvider != null ? searchStatInfoProvider.a() : false;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = this.e;
        if (musicPlaybackLaunchContext == null) {
            musicPlaybackLaunchContext = a2 ? MusicPlaybackLaunchContext.o.Bb(uIBlockMusicArtistNew.b) : MusicPlaybackLaunchContext.Fb(uIBlockMusicArtistNew.f);
        }
        Pair pair = z2 ? new Pair(ShuffleMode.SHUFFLE_ON, musicPlaybackLaunchContext.Ab()) : new Pair(ShuffleMode.SHUFFLE_OFF, musicPlaybackLaunchContext);
        ShuffleMode shuffleMode = (ShuffleMode) pair.d();
        MusicPlaybackLaunchContext musicPlaybackLaunchContext2 = (MusicPlaybackLaunchContext) pair.g();
        String str2 = "";
        if (z2) {
            List<MusicArtistInfo> list = uIBlockMusicArtistNew.C;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                g5g.y(((MusicArtistInfo) it.next()).b, arrayList);
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (epx.f(((MusicArtistChip) obj).i, CatalogViewType.SYNTHETIC_ACTION_PLAY_SHUFFLED_AUDIO_FROM_BLOCK.getId())) {
                        break;
                    }
                }
            }
            MusicArtistChip musicArtistChip = (MusicArtistChip) obj;
            str = musicArtistChip != null ? musicArtistChip.h : null;
        } else {
            MusicArtistInfo musicArtistInfo = (MusicArtistInfo) j5g.a0(uIBlockMusicArtistNew.C);
            str = musicArtistInfo != null ? musicArtistInfo.i : null;
        }
    }

    public abstract void d(Context context);

    public abstract void e();

    public abstract q<Integer> g(UIBlockMusicPage uIBlockMusicPage);

    public final void h() {
        View view = this.k;
        if (view == null) {
            view = null;
        }
        boolean z = view instanceof ImageView;
        int i2 = this.u;
        if (z) {
            ((ImageView) view).setImageResource(i2);
        } else if (view instanceof VkButton) {
            Integer valueOf = Integer.valueOf(i2);
            int[] iArr = VkButton.W;
            ((VkButton) view).a5(true, valueOf);
        }
    }

    public final void j(boolean z, boolean z2) {
        if (z) {
            View view = this.j;
            if (view == null) {
                view = null;
            }
            bwt0.p0(view, true);
            View view2 = this.j;
            if (view2 == null) {
                view2 = null;
            }
            Drawable drawable = this.t;
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setText(R.string.music_artist_curator_followed);
                return;
            } else {
                if (view2 instanceof ImageView) {
                    ((ImageView) view2).setImageDrawable(drawable);
                    return;
                }
                return;
            }
        }
        if (!z2) {
            View view3 = this.j;
            bwt0.p0(view3 != null ? view3 : null, false);
            return;
        }
        View view4 = this.j;
        if (view4 == null) {
            view4 = null;
        }
        bwt0.p0(view4, true);
        View view5 = this.j;
        if (view5 == null) {
            view5 = null;
        }
        Drawable drawable2 = this.s;
        if (view5 instanceof TextView) {
            TextView textView2 = (TextView) view5;
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setText(R.string.music_follow_artist_curator);
        } else if (view5 instanceof ImageView) {
            ((ImageView) view5).setImageDrawable(drawable2);
        }
        e();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b.P0(this.w, false);
        View inflate = layoutInflater.inflate(R.layout.catalog_artist_info_new, viewGroup, false);
        this.s = enj.d(R.drawable.vk_icon_add_24, R.color.vk_white, inflate.getContext());
        this.t = enj.d(R.drawable.vk_icon_done_24, R.color.vk_white, inflate.getContext());
        TextView textView = (TextView) inflate.findViewById(R.id.artist_name);
        if (textView != null) {
            com.vk.typography.b.k(textView, FontFamily.DISPLAY_DEMIBOLD, null, 6);
        } else {
            textView = null;
        }
        this.n = textView;
        this.h = (VKImageView) inflate.findViewById(R.id.artist_header_image);
        View findViewById = inflate.findViewById(R.id.subscription_state);
        findViewById.setOnClickListener(this);
        this.j = findViewById;
        TextView textView2 = (TextView) inflate.findViewById(R.id.artist_listeners);
        com.vk.typography.b.k(textView2, FontFamily.REGULAR, null, 6);
        this.i = textView2;
        View findViewById2 = inflate.findViewById(R.id.artist_listen_all);
        findViewById2.setOnClickListener(new c98(this, 1));
        this.k = findViewById2;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.artist_action_chips);
        this.l = recyclerView;
        RecyclerView recyclerView2 = recyclerView != null ? recyclerView : null;
        inflate.getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView2.setAdapter(this.v);
        recyclerView2.addItemDecoration(new c(e3m.a(R.dimen.catalog_artist_chip_space, inflate.getContext())));
        int z = iah0.z(inflate.getContext());
        int a2 = iah0.a(800);
        if (z > a2) {
            z = a2;
        }
        this.m = z;
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        String str;
        String str2;
        String str3;
        UIBlockMusicArtistNew uIBlockMusicArtistNew = this.o;
        if (uIBlockMusicArtistNew == null) {
            return;
        }
        Artist artist = uIBlockMusicArtistNew.z;
        if (view == null || (context = view.getContext()) == null) {
            return;
        }
        int id = view.getId();
        if (id == R.id.artist_listen_all) {
            if (jnj.j(artist.m)) {
                i0q0.f(new i3r(context, 2));
                return;
            }
            MusicArtistInfo musicArtistInfo = (MusicArtistInfo) j5g.a0(uIBlockMusicArtistNew.C);
            if (musicArtistInfo != null && (str3 = musicArtistInfo.d) != null) {
                c(CommonAudioStat$TypeAudioArtistClickItem.EventType.ITEM_CLICK, str3);
            }
            b(uIBlockMusicArtistNew, false);
            return;
        }
        if (id == R.id.subscription_state && this.p == null) {
            if (artist.i) {
                MusicArtistInfo musicArtistInfo2 = (MusicArtistInfo) j5g.a0(uIBlockMusicArtistNew.C);
                if (musicArtistInfo2 != null && (str2 = musicArtistInfo2.e) != null) {
                    c(CommonAudioStat$TypeAudioArtistClickItem.EventType.ITEM_UNFOLLOW_CLICK, str2);
                }
                this.q = new dw20.b(context, null).P(Collections.singletonList(new brj0(0, 0, null, 0, context.getString(R.string.music_unfollow_artist), true, false, null, 0, null, TitleColorAttr.DESTRUCTIVE, null, null, null, 126894)), new oh3(21, this, uIBlockMusicArtistNew)).I0(null);
                return;
            }
            if (artist.h) {
                MusicArtistInfo musicArtistInfo3 = (MusicArtistInfo) j5g.a0(uIBlockMusicArtistNew.C);
                if (musicArtistInfo3 != null && (str = musicArtistInfo3.e) != null) {
                    c(CommonAudioStat$TypeAudioArtistClickItem.EventType.ITEM_FOLLOW_CLICK, str);
                }
                this.c.a(new cfp0(uIBlockMusicArtistNew, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Subscribe)));
                q<Integer> a2 = a(uIBlockMusicArtistNew);
                this.p = a2 != null ? a2.subscribe(new s520(new zo8(this, uIBlockMusicArtistNew, context, 5), 4), new amt(new lxz(this, 8), 15)) : null;
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i2, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
