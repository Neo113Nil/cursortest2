package com.vk.catalog2.feature.music.holders.concert;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenUrl;
import com.vk.catalog2.common.dto.api.music.CatalogConcertItem;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockConcert;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.music.Concert;
import com.vk.imageloader.view.VKImageView;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioArtistClickItem;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import xsna.abg0;
import xsna.b5a;
import xsna.bjc;
import xsna.dhr0;
import xsna.e3m;
import xsna.i5s;
import xsna.jjc;
import xsna.jwi;
import xsna.ogd;
import xsna.qdz;
import xsna.v1v;

/* compiled from: ConcertVh.kt */
/* loaded from: classes16.dex */
public final class ConcertVh implements CatalogViewHolder {
    public final ConcertCardType b;
    public final qdz c;
    public final ConcertRefSource d;
    public final b5a e;
    public View f;
    public VKImageView g;
    public TextView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public TextView l;
    public TextView m;
    public VkButton n;

    /* compiled from: ConcertVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConcertCardType.values().length];
            try {
                iArr[ConcertCardType.ARTIST_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConcertCardType.FULL_PAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConcertCardType.SEARCH_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ConcertVh(ConcertCardType concertCardType, qdz qdzVar, ConcertRefSource concertRefSource, b5a b5aVar) {
        this.b = concertCardType;
        this.c = qdzVar;
        this.d = concertRefSource;
        this.e = b5aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        ConcertVh concertVh;
        UIBlock uIBlock2;
        String str;
        if (uIBlock instanceof UIBlockConcert) {
            View view = this.f;
            if (view == null) {
                view = null;
            }
            Context context = view.getContext();
            View view2 = this.f;
            if (view2 == null) {
                view2 = null;
            }
            UIBlockConcert uIBlockConcert = (UIBlockConcert) uIBlock;
            CatalogConcertItem catalogConcertItem = uIBlockConcert.z;
            view2.setLayoutParams(new FrameLayout.LayoutParams(!uIBlockConcert.y ? e3m.a(R.dimen.catalog_slider_concert_item_width, context) : -1, -2));
            Concert concert = catalogConcertItem.b;
            CatalogButtonOpenUrl catalogButtonOpenUrl = catalogConcertItem.c;
            Concert concert2 = catalogConcertItem.b;
            OffsetDateTime parse = OffsetDateTime.parse(concert.h, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
            String[] stringArray = context.getResources().getStringArray(R.array.months_short);
            String[] stringArray2 = context.getResources().getStringArray(R.array.months_full_dep);
            int monthValue = parse.getMonthValue() - 1;
            String str2 = stringArray[monthValue];
            if (str2.length() > 0) {
                str2 = ((Object) String.valueOf(str2.charAt(0)).toUpperCase(Locale.ROOT)) + str2.substring(1);
            }
            String valueOf = String.valueOf(parse.getDayOfMonth());
            StringBuilder b = v1v.b(valueOf, ' ');
            b.append(stringArray2[monthValue]);
            String sb = b.toString();
            String format = parse.format(DateTimeFormatter.ofPattern("HH:mm"));
            int[] iArr = a.$EnumSwitchMapping$0;
            ConcertCardType concertCardType = this.b;
            int i = iArr[concertCardType.ordinal()];
            if (i == 1 || i == 2) {
                TextView textView = this.j;
                if (textView == null) {
                    textView = null;
                }
                textView.setText(concert2.f.c);
                TextView textView2 = this.k;
                if (textView2 == null) {
                    textView2 = null;
                }
                textView2.setText(concert2.d);
                TextView textView3 = this.m;
                if (textView3 == null) {
                    textView3 = null;
                }
                textView3.setText(concert2.e);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                TextView textView4 = this.j;
                if (textView4 == null) {
                    textView4 = null;
                }
                textView4.setText(concert2.c);
                TextView textView5 = this.k;
                if (textView5 == null) {
                    textView5 = null;
                }
                textView5.setText(concert2.f.c);
                TextView textView6 = this.m;
                if (textView6 == null) {
                    textView6 = null;
                }
                textView6.setText(concert2.d);
            }
            VKImageView vKImageView = this.g;
            if (vKImageView == null) {
                vKImageView = null;
            }
            abg0 abg0Var = dhr0.t;
            vKImageView.setPlaceholderColor(abg0Var.c(R.attr.vk_ui_background_secondary));
            TextView textView7 = this.i;
            if (textView7 == null) {
                textView7 = null;
            }
            textView7.setTextColor(abg0Var.c(R.attr.vk_ui_text_primary));
            TextView textView8 = this.h;
            if (textView8 == null) {
                textView8 = null;
            }
            textView8.setTextColor(abg0Var.c(R.attr.vk_ui_text_primary));
            TextView textView9 = this.i;
            if (textView9 == null) {
                textView9 = null;
            }
            textView9.setText(str2);
            TextView textView10 = this.h;
            if (textView10 == null) {
                textView10 = null;
            }
            textView10.setText(valueOf);
            if (concertCardType == ConcertCardType.FULL_PAGE) {
                TextView textView11 = this.l;
                if (textView11 == null) {
                    textView11 = null;
                }
                textView11.setVisibility(0);
                TextView textView12 = this.l;
                if (textView12 == null) {
                    textView12 = null;
                }
                textView12.setText(" · " + format);
            } else {
                TextView textView13 = this.l;
                if (textView13 == null) {
                    textView13 = null;
                }
                textView13.setVisibility(8);
            }
            if (catalogButtonOpenUrl != null) {
                ActionOpenUrl actionOpenUrl = catalogButtonOpenUrl.f;
                if (actionOpenUrl != null) {
                    VkButton vkButton = this.n;
                    if (vkButton == null) {
                        vkButton = null;
                    }
                    concertVh = this;
                    uIBlock2 = uIBlock;
                    jjc.g(vkButton, new jwi(concertVh, uIBlock2, actionOpenUrl, context, 0));
                } else {
                    concertVh = this;
                    uIBlock2 = uIBlock;
                }
                VkButton vkButton2 = concertVh.n;
                if (vkButton2 == null) {
                    vkButton2 = null;
                }
                vkButton2.setText(catalogButtonOpenUrl.e);
            } else {
                concertVh = this;
                uIBlock2 = uIBlock;
            }
            View view3 = concertVh.f;
            if (view3 == null) {
                view3 = null;
            }
            jjc.g(view3, new ogd(this, uIBlock2, context, 1));
            StringBuilder sb2 = new StringBuilder("\n            ");
            sb2.append(sb);
            sb2.append("\n            ");
            TextView textView14 = concertVh.j;
            if (textView14 == null) {
                textView14 = null;
            }
            sb2.append((Object) textView14.getText());
            sb2.append("\n            ");
            TextView textView15 = concertVh.k;
            if (textView15 == null) {
                textView15 = null;
            }
            sb2.append((Object) textView15.getText());
            sb2.append("\n            ");
            TextView textView16 = concertVh.l;
            if (textView16 == null) {
                textView16 = null;
            }
            sb2.append((Object) textView16.getText());
            sb2.append(" \n            ");
            TextView textView17 = concertVh.m;
            if (textView17 == null) {
                textView17 = null;
            }
            sb2.append((Object) textView17.getText());
            sb2.append("\n            ");
            if (catalogButtonOpenUrl == null || (str = catalogButtonOpenUrl.e) == null) {
                str = "";
            }
            String a2 = i5s.a(sb2, str, "\n        ");
            View view4 = concertVh.f;
            (view4 != null ? view4 : null).setContentDescription(a2);
        }
    }

    public final void a(CommonAudioStat$TypeAudioArtistClickItem.EventType eventType, String str) {
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
        if (str == null) {
            str = "";
        }
        new bjc(c, SchemeStat$TypeClick.a.b(schemeStat$EventItem, new CommonAudioStat$TypeAudioArtistClickItem(new CommonStat$TypeTrackCodeItem(str), this.d.h(), eventType), 2)).q();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog2_concert_slider_item, viewGroup, false);
        this.f = inflate.getRootView();
        this.g = (VKImageView) inflate.findViewById(R.id.concert_slider_item_image);
        this.h = (TextView) inflate.findViewById(R.id.concert_slider_item_day);
        this.i = (TextView) inflate.findViewById(R.id.concert_slider_item_month);
        this.j = (TextView) inflate.findViewById(R.id.concert_slider_item_title);
        this.k = (TextView) inflate.findViewById(R.id.concert_slider_item_subtitle1);
        this.l = (TextView) inflate.findViewById(R.id.concert_slider_item_subtitle2);
        this.m = (TextView) inflate.findViewById(R.id.concert_slider_item_extrasubtitle);
        this.n = (VkButton) inflate.findViewById(R.id.concert_slider_item_button);
        VKImageView vKImageView = this.g;
        if (vKImageView == null) {
            vKImageView = null;
        }
        View view = this.f;
        if (view == null) {
            view = null;
        }
        float a2 = e3m.a(R.dimen.catalog_slider_concert_item_avatar_border_width, view.getContext());
        View view2 = this.f;
        vKImageView.y0(a2, (view2 != null ? view2 : null).getContext().getColor(R.color.vk_black_alpha8));
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
