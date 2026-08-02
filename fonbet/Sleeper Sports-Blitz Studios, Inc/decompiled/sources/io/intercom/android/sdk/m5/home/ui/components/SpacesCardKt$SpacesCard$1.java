package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.HomeItemKt;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.SpaceItem;
import io.intercom.android.sdk.m5.home.data.SpaceItemType;
import io.intercom.android.sdk.m5.home.reducers.HomeItemBadgeReducerKt;
import io.intercom.android.sdk.m5.home.states.HomeItemBadge;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SpacesCard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class SpacesCardKt$SpacesCard$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ HomeCards.HomeSpacesData $homeSpacesData;
    final /* synthetic */ Function1<SpaceItemType, Unit> $onItemClick;

    /* compiled from: SpacesCard.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpaceItemType.values().length];
            try {
                iArr[SpaceItemType.MESSAGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SpaceItemType.HELP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SpaceItemType.TICKETS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    SpacesCardKt$SpacesCard$1(HomeCards.HomeSpacesData homeSpacesData, Function1<? super SpaceItemType, Unit> function1) {
        this.$homeSpacesData = homeSpacesData;
        this.$onItemClick = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope IntercomCard, Composer composer, int i) {
        int i2;
        boolean z;
        char c;
        Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            HomeCards.HomeSpacesData homeSpacesData = this.$homeSpacesData;
            final Function1<SpaceItemType, Unit> function1 = this.$onItemClick;
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m5333constructorimpl = Updater.m5333constructorimpl(composer);
            Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            List<SpaceItem> spaceItems = homeSpacesData.getSpaceItems();
            ArrayList arrayList = new ArrayList();
            for (Object obj : spaceItems) {
                if (ArraysKt.contains(SpaceItemType.values(), ((SpaceItem) obj).getType())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = arrayList;
            composer.startReplaceGroup(-1735936299);
            int i3 = 0;
            for (Object obj2 : arrayList2) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final SpaceItem spaceItem = (SpaceItem) obj2;
                int i5 = WhenMappings.$EnumSwitchMapping$0[spaceItem.getType().ordinal()];
                if (i5 == 1) {
                    i2 = R.drawable.intercom_messages_icon;
                } else if (i5 == 2) {
                    i2 = R.drawable.intercom_help_centre_icon;
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R.drawable.intercom_ticket_detail_icon;
                }
                String label = spaceItem.getLabel();
                HomeItemBadge reduceHomeItemBadge = HomeItemBadgeReducerKt.reduceHomeItemBadge(spaceItem.getBadge());
                Integer valueOf = Integer.valueOf(i2);
                composer.startReplaceGroup(-1302667345);
                boolean changed = composer.changed(function1) | composer.changed(spaceItem);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.components.SpacesCardKt$SpacesCard$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1;
                            invoke$lambda$4$lambda$3$lambda$2$lambda$1 = SpacesCardKt$SpacesCard$1.invoke$lambda$4$lambda$3$lambda$2$lambda$1(Function1.this, spaceItem);
                            return invoke$lambda$4$lambda$3$lambda$2$lambda$1;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                int i6 = i3;
                HomeItemKt.HomeItem(null, valueOf, null, null, null, label, null, reduceHomeItemBadge, (Function0) rememberedValue, composer, 0, 93);
                composer.startReplaceGroup(-1735917837);
                if (i6 != arrayList2.size() - 1) {
                    c = 16;
                    z = false;
                    IntercomDividerKt.IntercomDivider(PaddingKt.m1159paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8798constructorimpl(16), 0.0f, 2, null), composer, 6, 0);
                } else {
                    z = false;
                    c = 16;
                }
                composer.endReplaceGroup();
                i3 = i4;
            }
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1(Function1 onItemClick, SpaceItem item) {
        Intrinsics.checkNotNullParameter(onItemClick, "$onItemClick");
        Intrinsics.checkNotNullParameter(item, "$item");
        onItemClick.invoke(item.getType());
        return Unit.INSTANCE;
    }
}
