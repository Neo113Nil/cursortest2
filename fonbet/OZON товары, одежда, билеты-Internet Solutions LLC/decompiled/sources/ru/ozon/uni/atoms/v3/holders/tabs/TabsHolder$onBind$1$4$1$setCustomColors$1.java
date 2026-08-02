package ru.ozon.uni.atoms.v3.holders.tabs;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.atom.tabs.TabView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TabsHolder$onBind$1$4$1$setCustomColors$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ TabsDTO $item;
    final /* synthetic */ TabsDTO.TabDTO $tabDTO;
    final /* synthetic */ TabView $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabsHolder$onBind$1$4$1$setCustomColors$1(TabsDTO.TabDTO tabDTO, TabView tabView, TabsDTO tabsDTO) {
        super(0);
        this.$tabDTO = tabDTO;
        this.$this_apply = tabView;
        this.$item = tabsDTO;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2() {
        String selectedBackgroundColor = this.$tabDTO.getSelectedBackgroundColor();
        if (selectedBackgroundColor != null) {
            Color color = null;
            if (this.$item.getTabStyle() != TabsDTO.Style.CUSTOM) {
                selectedBackgroundColor = null;
            }
            if (selectedBackgroundColor != null) {
                TabView tabView = this.$this_apply;
                UniGradient gradientByToken = TokensExtKt.getGradientByToken(selectedBackgroundColor);
                if (gradientByToken != null) {
                    Context context = tabView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    Color gradient = TokensExtKt.toGradient(gradientByToken, context);
                    if (gradient != null) {
                        color = gradient;
                        if (color != null) {
                            this.$this_apply.setBgSelected(color);
                        }
                    }
                }
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context2 = tabView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Integer parseColor = styleParser.parseColor(context2, selectedBackgroundColor);
                if (parseColor != null) {
                    color = new Color.Solid(parseColor.intValue());
                }
                if (color != null) {
                }
            }
        }
        this.$this_apply.setTitle(this.$tabDTO.getTitle());
        TabsDTO.Style tabStyle = this.$item.getTabStyle();
        TabsDTO.Style style = TabsDTO.Style.CUSTOM;
        if (tabStyle == style) {
            StyleParser styleParser2 = StyleParser.INSTANCE;
            Context context3 = this.$this_apply.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Integer parseColor2 = styleParser2.parseColor(context3, this.$tabDTO.getTitleColor());
            if (parseColor2 != null) {
                this.$this_apply.setTitleColor(Integer.valueOf(parseColor2.intValue()));
            }
        }
        this.$this_apply.setSubtitle(this.$tabDTO.getSubtitle());
        if (this.$item.getTabStyle() == style) {
            StyleParser styleParser3 = StyleParser.INSTANCE;
            Context context4 = this.$this_apply.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            Integer parseColor3 = styleParser3.parseColor(context4, this.$tabDTO.getSubtitleColor());
            if (parseColor3 != null) {
                this.$this_apply.setSubtitleColor(Integer.valueOf(parseColor3.intValue()));
            }
        }
    }
}
