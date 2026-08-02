package com.vk.newsfeed.common.views.header;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.newsfeed.Owner;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.OverlayImage;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.header.HeaderTitle;
import com.vk.feed.core.models.header.SourcePhoto;
import com.vk.imageloader.view.VKImageView;
import com.vk.newsfeed.common.views.header.HeaderPhotoView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bwt0;
import xsna.cn70;
import xsna.e43;
import xsna.f4m;
import xsna.h170;
import xsna.his0;
import xsna.j5g;
import xsna.krv0;
import xsna.ol60;
import xsna.pvo0;
import xsna.rwm0;
import xsna.ucp;
import xsna.znk0;
import xsna.zrp;

/* compiled from: CompactHeaderView.kt */
/* loaded from: classes4.dex */
public final class CompactHeaderView extends ConstraintLayout {
    public static final int u = cn70.b(36);
    public static final int v = cn70.b(20);
    public static final int w;
    public static final int x;
    public DisplayMode t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CompactHeaderView.kt */
    public static final class DisplayMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DisplayMode[] $VALUES;
        public static final DisplayMode DEFAULT;
        public static final DisplayMode OVERLAY;

        static {
            DisplayMode displayMode = new DisplayMode("DEFAULT", 0);
            DEFAULT = displayMode;
            DisplayMode displayMode2 = new DisplayMode("OVERLAY", 1);
            OVERLAY = displayMode2;
            DisplayMode[] displayModeArr = {displayMode, displayMode2};
            $VALUES = displayModeArr;
            $ENTRIES = new asp(displayModeArr);
        }

        public DisplayMode() {
            throw null;
        }

        public static DisplayMode valueOf(String str) {
            return (DisplayMode) Enum.valueOf(DisplayMode.class, str);
        }

        public static DisplayMode[] values() {
            return (DisplayMode[]) $VALUES.clone();
        }
    }

    /* compiled from: CompactHeaderView.kt */
    public interface a {
    }

    /* compiled from: CompactHeaderView.kt */
    public static final class b {
        public boolean a;
    }

    /* compiled from: CompactHeaderView.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisplayMode.values().length];
            try {
                iArr[DisplayMode.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplayMode.OVERLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        cn70.b(20);
        w = R.color.vk_white;
        x = R.color.vk_white_alpha60;
    }

    private final b getCurrentState() {
        throw null;
    }

    private final void setupTitleAndSubtitleViews(boolean z) {
        int b2 = cn70.b(z ? 8 : 10);
        if (z) {
            cn70.b(36);
        }
        if (!z) {
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        }
        f4m.s(b2, null);
        throw null;
    }

    public final ViewGroup getActionViewContainer() {
        return null;
    }

    public final View getIconView() {
        return null;
    }

    public final VKImageView getImageStatusView() {
        return null;
    }

    public final ImageView getOptionsView() {
        return null;
    }

    public final CompactHeaderAvatarView getPhotoView() {
        return null;
    }

    public final View getPinView() {
        return null;
    }

    public final ImageView getStatisticsView() {
        return null;
    }

    public final rwm0 getSubscribeViewDelegate() {
        return null;
    }

    public final TextView getSubtitleView() {
        return null;
    }

    public final TextView getTitleView() {
        return null;
    }

    public final TextView getWarningView() {
        return null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (bwt0.K(null)) {
            throw null;
        }
        setTouchDelegate(null);
    }

    public final void setDisplayMode(DisplayMode displayMode) {
        if (displayMode == this.t) {
            return;
        }
        this.t = displayMode;
        int i = c.$EnumSwitchMapping$0[displayMode.ordinal()];
        if (i == 1) {
            krv0.l(R.attr.vk_ui_text_primary);
            throw null;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        his0.x(null, w);
        int i2 = x;
        his0.x(null, i2);
        his0.x(null, i2);
    }

    public final void setHeader(EntryHeader entryHeader) {
        String str;
        Image image;
        HeaderTitle headerTitle = entryHeader.c;
        b currentState = getCurrentState();
        Integer num = entryHeader.h;
        if (num != null) {
            int intValue = num.intValue();
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            pvo0.k(intValue, context.getResources(), true);
        }
        currentState.getClass();
        b currentState2 = getCurrentState();
        List<Description> list = entryHeader.e;
        if (list != null) {
        }
        currentState2.getClass();
        getCurrentState().getClass();
        SourcePhoto sourcePhoto = entryHeader.b;
        if (sourcePhoto != null) {
            b currentState3 = getCurrentState();
            Owner d = sourcePhoto.d();
            String str2 = sourcePhoto.d;
            if (d != null && d.q) {
                boolean z = getCurrentState().a;
            }
            currentState3.getClass();
            Owner d2 = sourcePhoto.d();
            boolean i = d2 != null ? d2.i(1024) : false;
            b currentState4 = getCurrentState();
            if (i) {
                AvatarBorderType avatarBorderType = AvatarBorderType.HEXAGON;
            } else {
                AvatarBorderType avatarBorderType2 = AvatarBorderType.CIRCLE;
            }
            currentState4.getClass();
            Owner d3 = sourcePhoto.d();
            if (d3 == null || (image = d3.g) == null) {
                image = sourcePhoto.c;
            }
            b currentState5 = getCurrentState();
            if (image != null) {
                Serializer.c<Owner> cVar = Owner.CREATOR;
                Owner.a.a(u, image);
            } else if (str2 == null || str2.length() == 0) {
                Owner d4 = sourcePhoto.d();
                String str3 = d4 != null ? d4.e : null;
                if (str3 != null && str3.length() != 0) {
                    sourcePhoto.d();
                }
            }
            currentState5.getClass();
        }
        OverlayImage overlayImage = entryHeader.f;
        if (overlayImage != null) {
            b currentState6 = getCurrentState();
            Image image2 = overlayImage.b;
            if (image2 != null) {
                Serializer.c<Owner> cVar2 = Owner.CREATOR;
                Owner.a.a(v, image2);
            }
            currentState6.getClass();
            b currentState7 = getCurrentState();
            String str4 = overlayImage.d;
            if (str4 != null) {
                znk0.r(getContext(), str4);
            }
            currentState7.getClass();
        }
        getCurrentState().getClass();
        getCurrentState().getClass();
        getCurrentState().getClass();
        ucp ucpVar = ucp.a;
        if (headerTitle != null) {
            List<Text> list2 = headerTitle.c;
            Text text = list2 != null ? (Text) j5g.a0(list2) : null;
            if (text != null) {
                str = text.b;
                ucp.i(str);
                throw null;
            }
        }
        str = null;
        ucp.i(str);
        throw null;
    }

    public final void setHeaderContentDescription(EntryHeader entryHeader) {
        throw null;
    }

    public final void setIsAdvertisement(boolean z) {
        getCurrentState().a = z;
    }

    public final void setIsAuthorAd(boolean z) {
        getCurrentState().getClass();
    }

    public final void setIsOwnersImageStatusDisabled(boolean z) {
        getCurrentState().getClass();
    }

    public final void setIsTranslated(boolean z) {
        getCurrentState().getClass();
    }

    public final void setPhotoClickListener(HeaderPhotoView.c cVar) {
        throw null;
    }

    public final void setPinVisibility(boolean z) {
        getCurrentState().getClass();
    }

    public final void setPublishedByOwner(boolean z) {
        getCurrentState().getClass();
    }

    public final void setDescriptionClickListener(a aVar) {
    }

    public final void setTogglesConfig(h170 h170Var) {
    }

    public final void setUiDto(ol60 ol60Var) {
    }
}
