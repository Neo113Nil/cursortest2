package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics;

import B90.p0;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import net.cachapa.expandablelayout.ExpandableLayout;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.databinding.PdpWidgetComparisonCharateristicsGroupBinding;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.CharacteristicsGroupViewHolder;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\r*\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010%\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicsGroupViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicsGroupVO;", "Lru/ozon/app/android/pdp/ui/configurators/databinding/PdpWidgetComparisonCharateristicsGroupBinding;", "binding", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicsGroupViewHolderType;", "type", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/databinding/PdpWidgetComparisonCharateristicsGroupBinding;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicsGroupViewHolderType;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "isExpanded", "", "setGroupExpandationState", "(Lru/ozon/app/android/pdp/ui/configurators/databinding/PdpWidgetComparisonCharateristicsGroupBinding;Z)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicsGroupVO;Ll20/d;)V", "Lkotlin/Function0;", "stateListener", "addOnExpansionStateChangeListener", "(Lkotlin/jvm/functions/Function0;)V", "removeOnExpansionStateChangeListener", "()V", "Lru/ozon/app/android/pdp/ui/configurators/databinding/PdpWidgetComparisonCharateristicsGroupBinding;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicsGroupViewHolderType;", "getType", "()Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicsGroupViewHolderType;", "Lru/ozon/app/android/composer/ComposerReferences;", "getComposerReferences", "()Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicsAdapter;", "characteristicsAdapter", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicsAdapter;", "expansionStateListener", "Lkotlin/jvm/functions/Function0;", "Companion", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CharacteristicsGroupViewHolder extends k<CharacteristicsGroupVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final PdpWidgetComparisonCharateristicsGroupBinding binding;

    @NotNull
    private final CharacteristicsAdapter characteristicsAdapter;

    @NotNull
    private final ComposerReferences composerReferences;
    private Function0<Unit> expansionStateListener;

    @NotNull
    private final CharacteristicsGroupViewHolderType type;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicsGroupViewHolder$Companion;", "", "<init>", "()V", "EXPANDED_ROTATION", "", "COLLAPSED_ROTATION", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CharacteristicsGroupViewHolder(@NotNull PdpWidgetComparisonCharateristicsGroupBinding binding, @NotNull CharacteristicsGroupViewHolderType type, @NotNull ComposerReferences composerReferences) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.type = type;
        this.composerReferences = composerReferences;
        CharacteristicsAdapter characteristicsAdapter = new CharacteristicsAdapter(composerReferences);
        this.characteristicsAdapter = characteristicsAdapter;
        binding.characteristicsRV.setAdapter(characteristicsAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3$lambda$2(final PdpWidgetComparisonCharateristicsGroupBinding pdpWidgetComparisonCharateristicsGroupBinding, final CharacteristicsGroupViewHolder characteristicsGroupViewHolder, final CharacteristicsGroupVO characteristicsGroupVO, View view) {
        ExpandableLayout expandableLayout = pdpWidgetComparisonCharateristicsGroupBinding.expandableLayout;
        if (expandableLayout.b()) {
            expandableLayout.c(false, true);
        } else {
            expandableLayout.c(true, true);
        }
        pdpWidgetComparisonCharateristicsGroupBinding.dropDownIconIV.animate().setInterpolator(new AccelerateDecelerateInterpolator()).rotation(pdpWidgetComparisonCharateristicsGroupBinding.expandableLayout.b() ? 180.0f : 0.0f).withStartAction(new Runnable() { // from class: kF.b
            @Override // java.lang.Runnable
            public final void run() {
                CharacteristicsGroupViewHolder.bind$lambda$3$lambda$2$lambda$0(CharacteristicsGroupViewHolder.this, characteristicsGroupVO, pdpWidgetComparisonCharateristicsGroupBinding);
            }
        }).withEndAction(new p0(characteristicsGroupViewHolder, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3$lambda$2$lambda$0(CharacteristicsGroupViewHolder characteristicsGroupViewHolder, CharacteristicsGroupVO characteristicsGroupVO, PdpWidgetComparisonCharateristicsGroupBinding pdpWidgetComparisonCharateristicsGroupBinding) {
        characteristicsGroupViewHolder.composerReferences.getController().d(new CharacteristicsGroupUpdateKey(characteristicsGroupVO.getId(), pdpWidgetComparisonCharateristicsGroupBinding.expandableLayout.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3$lambda$2$lambda$1(CharacteristicsGroupViewHolder characteristicsGroupViewHolder) {
        Function0<Unit> function0 = characteristicsGroupViewHolder.expansionStateListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void setGroupExpandationState(PdpWidgetComparisonCharateristicsGroupBinding pdpWidgetComparisonCharateristicsGroupBinding, boolean z11) {
        pdpWidgetComparisonCharateristicsGroupBinding.expandableLayout.c(z11, false);
        pdpWidgetComparisonCharateristicsGroupBinding.dropDownIconIV.setRotation(z11 ? 180.0f : 0.0f);
    }

    public final void addOnExpansionStateChangeListener(@NotNull Function0<Unit> stateListener) {
        Intrinsics.checkNotNullParameter(stateListener, "stateListener");
        this.expansionStateListener = stateListener;
    }

    @NotNull
    public final CharacteristicsGroupViewHolderType getType() {
        return this.type;
    }

    public final void removeOnExpansionStateChangeListener() {
        this.expansionStateListener = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull final CharacteristicsGroupVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        final PdpWidgetComparisonCharateristicsGroupBinding pdpWidgetComparisonCharateristicsGroupBinding = this.binding;
        pdpWidgetComparisonCharateristicsGroupBinding.titleTV.setText(item.getTitle());
        pdpWidgetComparisonCharateristicsGroupBinding.titleTV.setOnClickListener(new View.OnClickListener(this) { // from class: kF.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CharacteristicsGroupViewHolder f71147b;

            {
                this.f71147b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CharacteristicsGroupViewHolder.bind$lambda$3$lambda$2(pdpWidgetComparisonCharateristicsGroupBinding, this.f71147b, item, view);
            }
        });
        setGroupExpandationState(pdpWidgetComparisonCharateristicsGroupBinding, item.getIsExpanded());
        this.characteristicsAdapter.submitList(item.getCharacteristics());
    }
}
