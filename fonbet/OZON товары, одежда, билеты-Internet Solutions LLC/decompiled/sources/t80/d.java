package t80;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import r80.C9216a;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.updatewall.presentation.UpdateWallFragment;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;

/* loaded from: classes3.dex */
final class d implements Function2<C9216a, e, Unit> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ UpdateWallFragment f99265a;

    d(UpdateWallFragment updateWallFragment) {
        this.f99265a = updateWallFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C9216a c9216a, e eVar) {
        List<String> d11;
        C9216a binding = c9216a;
        e state = eVar;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(state, "state");
        binding.f83208b.bindState(state.a());
        String b11 = state.b();
        TextView textView = binding.f83210d;
        textView.setText(b11);
        textView.setGravity(state.c());
        String e11 = state.e();
        TextView textView2 = binding.f83211e;
        textView2.setText(e11);
        textView2.setGravity(state.c());
        LinearLayout linearLayout = binding.f83209c;
        if (linearLayout.getChildCount() == 0 && (d11 = state.d()) != null) {
            int i11 = 0;
            for (Object obj : d11) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                UpdateWallFragment updateWallFragment = this.f99265a;
                Context requireContext = updateWallFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                IconView iconView = new IconView(requireContext, null, 0, 6, null);
                iconView.setContentType(IconDTO.ContentType.TEXT);
                iconView.applyTextStyle(R.style.TextStyle_Head_M);
                StyleParser styleParser = StyleParser.INSTANCE;
                Context requireContext2 = updateWallFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                iconView.setBackColor(new Color.Solid(styleParser.parseColor(requireContext2, StyleParser.OzColor.OZ_SEMANTIC_CTRL_NEUTRAL_PALE.getValue(), R.color.oz_semantic_ctrl_neutral_pale)));
                iconView.setLabel(String.valueOf(i12));
                TextView textView3 = new TextView(updateWallFragment.requireContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                layoutParams.setMargins(textView3.getResources().getDimensionPixelSize(R.dimen.dimen_16), 0, 0, 0);
                textView3.setLayoutParams(layoutParams);
                Context requireContext3 = updateWallFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                TextViewExtKt.applyStyle(textView3, requireContext3, R.style.TextStyle_Body_L_Bold);
                textView3.setGravity(16);
                textView3.setText((String) obj);
                LinearLayout linearLayout2 = new LinearLayout(updateWallFragment.requireContext());
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
                layoutParams2.setMargins(0, linearLayout2.getResources().getDimensionPixelSize(R.dimen.dimen_8), 0, linearLayout2.getResources().getDimensionPixelSize(R.dimen.dimen_8));
                linearLayout2.setLayoutParams(layoutParams2);
                linearLayout2.setOrientation(0);
                linearLayout2.addView(iconView);
                linearLayout2.addView(textView3);
                linearLayout.addView(linearLayout2);
                i11 = i12;
            }
        }
        binding.f83212f.setVisibility(8);
        return Unit.f71690a;
    }
}
