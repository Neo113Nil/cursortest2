package ru.ozon.app.android.ugc.core.widgets.singlereview.userLikes;

import Bi.b;
import Kk.C3531a;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.CollectionsExtKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.ViewExtKt;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0014\u001a\u00020\u00112\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0002J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/userLikes/UserLikesView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "avatarsFlow", "Landroidx/constraintlayout/helper/widget/Flow;", "textTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "chevronIcv", "Lru/ozon/uni/android/atom/icon/IconView;", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "bind", "", "userLikes", "Lru/ozon/app/android/ugc/core/widgets/singlereview/userLikes/UserLikesVO;", "bindAvatars", "avatars", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getAvatarView", "Landroid/view/View;", "index", "", "avatar", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UserLikesView extends ConstraintLayout {

    @NotNull
    private final Flow avatarsFlow;

    @NotNull
    private final IconView chevronIcv;

    @NotNull
    private final TextAtomV2View textTav;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserLikesView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Flow flow = new Flow(context);
        flow.setId(R$id.reviewUserLikesAvatars);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        bVar.f41656t = 0;
        flow.setLayoutParams(bVar);
        flow.setOrientation(0);
        Dimens dimens = Dimens.INSTANCE;
        flow.setHorizontalGap(-dimens.getDP_8());
        addView(flow);
        this.avatarsFlow = flow;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.reviewUserLikesText, -2, -2);
        d11.f41636i = 0;
        d11.f41642l = 0;
        d11.f41655s = R$id.reviewUserLikesAvatars;
        d11.f41657u = R$id.reviewUserLikesChevron;
        d11.setMarginStart(dimens.getDP_6());
        d11.f41594A = 0;
        d11.f41616W = true;
        d11.f41598E = 0.0f;
        d11.f41603J = 2;
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setLines(1);
        textAtomV2View.setEllipsize(TextUtils.TruncateAt.END);
        addView(textAtomV2View);
        this.textTav = textAtomV2View;
        IconView iconView = new IconView(context, null, 0, 6, null);
        ConstraintLayout.b a11 = C3531a.a(iconView, R$id.reviewUserLikesChevron, -2, -2);
        int i11 = R$id.reviewUserLikesText;
        a11.f41642l = i11;
        a11.f41655s = i11;
        a11.f41658v = 0;
        iconView.setLayoutParams(a11);
        addView(iconView);
        this.chevronIcv = iconView;
    }

    private final void bindAvatars(List<IconDTO> avatars) {
        int[] iArr;
        ViewExtKt.cleanUpFlow(this, this.avatarsFlow);
        boolean isNotNullOrEmpty = CollectionsExtKt.isNotNullOrEmpty(avatars);
        if (isNotNullOrEmpty) {
            ArrayList arrayList = null;
            if (avatars != null) {
                List<IconDTO> list = avatars;
                ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
                int i11 = 0;
                for (Object obj : list) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    arrayList2.add(getAvatarView(i11, (IconDTO) obj));
                    i11 = i12;
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    addView((View) it.next());
                }
                arrayList = arrayList2;
            }
            Flow flow = this.avatarsFlow;
            if (arrayList != null) {
                ArrayList arrayList3 = new ArrayList(C7714v.z(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Integer.valueOf(((View) it2.next()).getId()));
                }
                iArr = C7714v.T0(arrayList3);
            } else {
                iArr = new int[0];
            }
            flow.setReferencedIds(iArr);
        }
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(this.avatarsFlow, Boolean.valueOf(isNotNullOrEmpty));
    }

    private final View getAvatarView(int index, IconDTO avatar) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(View.generateViewId());
        iconView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        iconView.setTranslationZ(-index);
        IconHolderKt.bind$default(iconView, avatar, null, 2, null);
        return iconView;
    }

    public final void bind(@NotNull UserLikesVO userLikes) {
        Intrinsics.checkNotNullParameter(userLikes, "userLikes");
        bindAvatars(userLikes.getAvatars());
        TextHolderKt.bind$default(this.textTav, userLikes.getText(), null, 2, null);
        IconHolderKt.bindOrGone$default(this.chevronIcv, userLikes.getIcon(), null, 2, null);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }
}
