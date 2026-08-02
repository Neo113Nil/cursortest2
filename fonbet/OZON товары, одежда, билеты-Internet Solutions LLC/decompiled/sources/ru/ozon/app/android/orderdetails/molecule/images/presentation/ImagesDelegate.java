package ru.ozon.app.android.orderdetails.molecule.images.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ge.n;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hB.ViewOnTouchListenerC6882a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegate;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVO;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImagesVO;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImagesView;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.adapter.ImagesAdapter;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.adapter.ImagesDecoration;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 02\u00020\u0001:\u00010BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011*\b\u0012\u0004\u0012\u00020\u00070\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010'R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/orderdetails/molecule/images/presentation/ImagesDelegate;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/J;", "lifecycle", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesView;", "view", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "adultListDelegate", "", "maxCount", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Landroidx/lifecycle/J;Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesView;Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;ILkotlin/jvm/functions/Function1;)V", "", "cropWithCounter", "(Ljava/util/List;)Ljava/util/List;", "owner", "onDestroy", "(Landroidx/lifecycle/J;)V", "onCreate", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesVO;", "item", "bind", "(Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesVO;)V", "Landroidx/recyclerview/widget/RecyclerView$o;", "layoutManager", "withLayoutManager", "(Landroidx/recyclerview/widget/RecyclerView$o;)Lru/ozon/app/android/orderdetails/molecule/images/presentation/ImagesDelegate;", "Landroidx/recyclerview/widget/RecyclerView$n;", "decoration", "withItemDecoration", "(Landroidx/recyclerview/widget/RecyclerView$n;)Lru/ozon/app/android/orderdetails/molecule/images/presentation/ImagesDelegate;", "Landroidx/lifecycle/J;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesView;", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "I", "Lkotlin/jvm/functions/Function1;", "Lkotlin/text/Regex;", "counterRegex", "Lkotlin/text/Regex;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/adapter/ImagesAdapter;", "imagesAdapter", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/adapter/ImagesAdapter;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesVO;", "Companion", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ImagesDelegate implements DefaultLifecycleObserver {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AdultListDelegate<ImageVO> adultListDelegate;

    @NotNull
    private final Regex counterRegex;

    @NotNull
    private final ImagesAdapter imagesAdapter;
    private ImagesVO item;

    @NotNull
    private final J lifecycle;
    private int maxCount;

    @NotNull
    private final ImagesView view;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int ITEM_SIZE_WITH_OFFSET = UiExtKt.toPx(70);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/orderdetails/molecule/images/presentation/ImagesDelegate$Companion;", "", "<init>", "()V", "ITEM_SIZE_WITH_OFFSET", "", "getITEM_SIZE_WITH_OFFSET", "()I", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getITEM_SIZE_WITH_OFFSET() {
            return ImagesDelegate.ITEM_SIZE_WITH_OFFSET;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImagesDelegate(@NotNull J lifecycle, @NotNull ImagesView view, @NotNull AdultListDelegate<ImageVO> adultListDelegate, int i11, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(adultListDelegate, "adultListDelegate");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.lifecycle = lifecycle;
        this.view = view;
        this.adultListDelegate = adultListDelegate;
        this.maxCount = i11;
        this.actionHandler = actionHandler;
        this.counterRegex = new Regex("\\d+");
        this.imagesAdapter = new ImagesAdapter(lifecycle, actionHandler);
        RecyclerView recyclerView = view.getRecyclerView();
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new ImagesDecoration(context));
        recyclerView.setOnTouchListener(new ViewOnTouchListenerC6882a(this, 0));
        lifecycle.getLifecycle().a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ImageVO> cropWithCounter(List<ImageVO> list) {
        TextDTO textDTO;
        String value;
        List K02 = C7714v.K0(list, this.maxCount);
        ArrayList arrayList = new ArrayList(C7714v.z(K02, 10));
        int i11 = 0;
        for (Object obj : K02) {
            int i12 = i11 + 1;
            Integer num = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ImageVO imageVO = (ImageVO) obj;
            int i13 = this.maxCount;
            if (i11 == i13 - 1 && i13 != list.size()) {
                int size = list.size() - this.maxCount;
                TextDTO counter = list.get(C7714v.P(list)).getCounter();
                if (counter != null) {
                    Regex regex = this.counterRegex;
                    OzonSpannableString text = counter.getText();
                    Regex.Companion companion = Regex.INSTANCE;
                    MatchResult b11 = regex.b(0, text);
                    if (b11 != null && (value = b11.getValue()) != null) {
                        num = Integer.valueOf(Integer.parseInt(value));
                    }
                    if (num != null) {
                        size += num.intValue();
                    }
                    textDTO = TextDTO.copy$default(counter, OzonSpannableStringKt.toOzonSpannableString("+" + size), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
                } else {
                    textDTO = new TextDTO(OzonSpannableStringKt.toOzonSpannableString("+" + size), null, null, null, null, null, TextPreset.PRESET_CUSTOM, UniTextStyles.BODY_ACCENT_500_MEDIUM.getToken(), UniColors.TEXT_LIGHT_KEY.getToken(), null, null, null, null, false, null, null, null, null, null, 523838, null);
                }
                imageVO = ImageVO.copy$default(imageVO, null, null, textDTO, false, false, false, null, null, null, null, null, 2043, null);
            }
            arrayList.add(imageVO);
            i11 = i12;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$1$lambda$0(ImagesDelegate imagesDelegate, View view, MotionEvent motionEvent) {
        CommonControlSettings common;
        AtomActionDTO action;
        CommonControlSettings common2;
        if (motionEvent.getActionMasked() != 1) {
            return false;
        }
        view.performClick();
        ImagesVO imagesVO = imagesDelegate.item;
        if (imagesVO != null && (common = imagesVO.getCommon()) != null && (action = common.getAction()) != null) {
            ImagesVO imagesVO2 = imagesDelegate.item;
            AtomAction atomAction = AtomActionMapperKt.toAtomAction(action, (imagesVO2 == null || (common2 = imagesVO2.getCommon()) == null) ? null : common2.getTrackingInfo());
            if (atomAction != null) {
                imagesDelegate.actionHandler.invoke(atomAction);
            }
        }
        return true;
    }

    public final void bind(ImagesVO item) {
        this.item = item;
        if (item == null) {
            ViewExtKt.gone(this.view);
            return;
        }
        this.adultListDelegate.bindItems(item.getImages());
        TextHolderKt.bindOrGone(this.view.getTitle(), item.getTitle(), this.actionHandler);
        ViewExtKt.show(this.view);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        C2399j.C(new C2408n0(n.a(this.adultListDelegate.observeItems()), new ImagesDelegate$onCreate$1(this, null)), K.a(this.lifecycle));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.view.getRecyclerView().setAdapter(null);
        super.onDestroy(owner);
    }

    @NotNull
    public final ImagesDelegate withItemDecoration(@NotNull RecyclerView.n decoration) {
        Intrinsics.checkNotNullParameter(decoration, "decoration");
        this.view.getRecyclerView().removeItemDecorationAt(0);
        this.view.getRecyclerView().addItemDecoration(decoration);
        return this;
    }

    @NotNull
    public final ImagesDelegate withLayoutManager(@NotNull RecyclerView.o layoutManager) {
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        this.view.getRecyclerView().setLayoutManager(layoutManager);
        return this;
    }
}
