package ru.ozon.app.android.common.emptyState;

import GZ.g;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.flags.PreCreationClientViewPoolFlag;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003:\u0001-B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R<\u0010)\u001a$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040'j\b\u0012\u0004\u0012\u00020\u0004`(0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/common/emptyState/EmptyStateViewMapper;", "", "T", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/common/emptyState/EmptyStateVO;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LGZ/g;", "router", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;LGZ/g;)V", "", "cartPrecreationEnabled", "()Z", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/common/emptyState/EmptyStateViewGroup;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/common/emptyState/EmptyStateViewGroup;", "oldItem", "newItem", "getPayload", "(Lru/ozon/app/android/common/emptyState/EmptyStateVO;Lru/ozon/app/android/common/emptyState/EmptyStateVO;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Z", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "EmptyStatePayload", "empty-state_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class EmptyStateViewMapper<T> extends WidgetViewMapper<T, EmptyStateVO> {
    private final boolean cartPrecreationEnabled;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final Function2<View, ComposerReferences, k<EmptyStateVO>> holderProducer;
    private final Integer layout;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/common/emptyState/EmptyStateViewMapper$EmptyStatePayload;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE", SelectionItemDescriptionDTO.TITLE, "MESSAGE", "ACTION", "empty-state_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class EmptyStatePayload {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ EmptyStatePayload[] $VALUES;
        public static final EmptyStatePayload IMAGE = new EmptyStatePayload("IMAGE", 0);
        public static final EmptyStatePayload TITLE = new EmptyStatePayload(SelectionItemDescriptionDTO.TITLE, 1);
        public static final EmptyStatePayload MESSAGE = new EmptyStatePayload("MESSAGE", 2);
        public static final EmptyStatePayload ACTION = new EmptyStatePayload("ACTION", 3);

        private static final /* synthetic */ EmptyStatePayload[] $values() {
            return new EmptyStatePayload[]{IMAGE, TITLE, MESSAGE, ACTION};
        }

        static {
            EmptyStatePayload[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private EmptyStatePayload(String str, int i11) {
        }

        public static EmptyStatePayload valueOf(String str) {
            return (EmptyStatePayload) Enum.valueOf(EmptyStatePayload.class, str);
        }

        public static EmptyStatePayload[] values() {
            return (EmptyStatePayload[]) $VALUES.clone();
        }
    }

    public EmptyStateViewMapper(@NotNull FeatureChecker featureChecker, @NotNull g router) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(router, "router");
        this.featureChecker = featureChecker;
        boolean cartPrecreationEnabled = cartPrecreationEnabled();
        this.cartPrecreationEnabled = cartPrecreationEnabled;
        this.layout = cartPrecreationEnabled ? null : Integer.valueOf(R$layout.empty_state_widget);
        this.holderProducer = new EmptyStateViewMapper$holderProducer$1(this, router);
    }

    private final boolean cartPrecreationEnabled() {
        return this.featureChecker.isEnabled(PreCreationClientViewPoolFlag.INSTANCE);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new EmptyStateCenteringDecoration());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<EmptyStateVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public EmptyStateViewGroup createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        EmptyStateViewGroup emptyStateViewGroup = new EmptyStateViewGroup(context, null, 0, 6, null);
        emptyStateViewGroup.setId(R$id.emptyStateContainer);
        emptyStateViewGroup.setOrientation(1);
        emptyStateViewGroup.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        emptyStateViewGroup.setFocusable(true);
        emptyStateViewGroup.setTag(ru.ozon.app.android.composer.R$id.skip_composer_default_widget_background, Unit.f71690a);
        return emptyStateViewGroup;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Object getPayload(@NotNull EmptyStateVO oldItem, @NotNull EmptyStateVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (!Intrinsics.d(oldItem.getImage(), newItem.getImage())) {
            arrayList.add(EmptyStatePayload.IMAGE);
        }
        if (!Intrinsics.d(oldItem.getTitle(), newItem.getTitle())) {
            arrayList.add(EmptyStatePayload.TITLE);
        }
        if (!Intrinsics.d(oldItem.getMessage(), newItem.getMessage())) {
            arrayList.add(EmptyStatePayload.MESSAGE);
        }
        if (!Intrinsics.d(oldItem.getAction(), newItem.getAction())) {
            arrayList.add(EmptyStatePayload.ACTION);
        }
        return arrayList;
    }
}
