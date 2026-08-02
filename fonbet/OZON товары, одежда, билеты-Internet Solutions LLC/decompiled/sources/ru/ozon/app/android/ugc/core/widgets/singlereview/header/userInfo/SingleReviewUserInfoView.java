package ru.ozon.app.android.ugc.core.widgets.singlereview.header.userInfo;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010 \u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/userInfo/SingleReviewUserInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "avatarUrl", "", "setupAvatar", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroidx/constraintlayout/widget/ConstraintLayout$b;", "getAvatarLayoutParams", "()Landroidx/constraintlayout/widget/ConstraintLayout$b;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/userInfo/SingleReviewUserInfoVO;", "item", "bind", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/header/userInfo/SingleReviewUserInfoVO;)V", "Landroid/widget/TextView;", "nameTv$delegate", "LSc/j;", "getNameTv", "()Landroid/widget/TextView;", "nameTv", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "externalReviewTav$delegate", "getExternalReviewTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "externalReviewTav", "avatarTv$delegate", "getAvatarTv", "avatarTv", "Landroid/widget/ImageView;", "avatarIv$delegate", "getAvatarIv", "()Landroid/widget/ImageView;", "avatarIv", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewUserInfoView extends ConstraintLayout {

    /* renamed from: avatarIv$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j avatarIv;

    /* renamed from: avatarTv$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j avatarTv;

    /* renamed from: externalReviewTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j externalReviewTav;

    /* renamed from: nameTv$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j nameTv;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleReviewUserInfoView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.nameTv = DelegatesKt.lazyUnsafe(new SingleReviewUserInfoView$special$$inlined$lazyView$1(this, context, this));
        this.externalReviewTav = DelegatesKt.lazyUnsafe(new SingleReviewUserInfoView$special$$inlined$lazyView$2(this, context, this));
        this.avatarTv = DelegatesKt.lazyUnsafe(new SingleReviewUserInfoView$special$$inlined$lazyView$3(this, context, this));
        this.avatarIv = DelegatesKt.lazyUnsafe(new SingleReviewUserInfoView$special$$inlined$lazyView$4(this, context, this));
        setLayoutParams(new RecyclerView.p(-1, -2));
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        int dp_16 = Dimens.INSTANCE.getDP_16();
        setPadding(dp_16, dp_16, dp_16, getPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView getAvatarIv() {
        return (ImageView) this.avatarIv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConstraintLayout.b getAvatarLayoutParams() {
        Dimens dimens = Dimens.INSTANCE;
        ConstraintLayout.b bVar = new ConstraintLayout.b(dimens.getDP_40(), dimens.getDP_40());
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        return bVar;
    }

    private final TextView getAvatarTv() {
        return (TextView) this.avatarTv.getValue();
    }

    private final TextAtomV2View getExternalReviewTav() {
        return (TextAtomV2View) this.externalReviewTav.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getNameTv() {
        return (TextView) this.nameTv.getValue();
    }

    private final void setupAvatar(String name, String avatarUrl) {
        ViewExtKt.show(getAvatarIv());
        Character ch2 = null;
        if (avatarUrl != null) {
            ImageViewExtKt.loadCircleImage$default(getAvatarIv(), avatarUrl, null, 2, null);
            return;
        }
        getAvatarIv().setImageDrawable(null);
        int i11 = 0;
        while (true) {
            if (i11 >= name.length()) {
                break;
            }
            char charAt = name.charAt(i11);
            if (!CharsKt.c(charAt)) {
                ch2 = Character.valueOf(charAt);
                break;
            }
            i11++;
        }
        if (ch2 != null) {
            TextViewExtKt.setTextOrGone(getAvatarTv(), ch2.toString());
        }
    }

    public final void bind(@NotNull SingleReviewUserInfoVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Iterator<View> it = C5316f0.b(this).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                break;
            } else {
                ViewExtKt.gone((View) c5314e0.next());
            }
        }
        setupAvatar(item.getName(), item.getAvatarUrl());
        TextViewExtKt.setTextOrGone(getNameTv(), item.getName());
        if (item.getExternalReview() != null) {
            TextHolderKt.bindOrGone$default(getExternalReviewTav(), item.getExternalReview(), null, 2, null);
        }
    }
}
