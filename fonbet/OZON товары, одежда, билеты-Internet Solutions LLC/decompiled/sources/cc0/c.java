package cc0;

import I.g;
import Sc.r;
import Sc.s;
import Vb0.b;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.net.URI;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.data.models.OtpDTO;
import ru.ozon.id.nativeauth.data.models.b;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.controls.button.UncontainedButtonView;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.Style;
import ru.ozon.uni.atoms.data.controls.button.UncontainedButtonDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.controls.button.UncontainedButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import td0.C9861a;

/* loaded from: classes7.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(LinearLayout linearLayout, List list, Function1 function1, Function1 function12, int i11) {
        final Function1 function13 = (i11 & 2) != 0 ? null : function1;
        final Function1 function14 = (i11 & 4) != 0 ? null : function12;
        Intrinsics.checkNotNullParameter(linearLayout, "<this>");
        linearLayout.removeAllViews();
        if (list != null) {
            int i12 = 0;
            for (final Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C7714v.O0();
                    throw null;
                }
                UncontainedButtonDTO uncontainedButtonDTO = new UncontainedButtonDTO(UncontainedButtonDTO.Preset.SIZE_500, Style.ACTION_SECONDARY, null, new CommonAtomLabelDTO(OzonSpannableStringKt.toOzonSpannableString(obj instanceof b.InterfaceC2133b ? ((b.InterfaceC2133b) obj).getTitle() : obj instanceof OtpDTO.HintButton ? ((OtpDTO.HintButton) obj).getTitle() : ""), null, null, null, null, null, null, false, null, 510, null), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4, 0 == true ? 1 : 0);
                View inflate = View.inflate(linearLayout.getContext(), R.layout.view_uncontained_button, null);
                Intrinsics.g(inflate, "null cannot be cast to non-null type ru.ozon.uni.android.controls.button.UncontainedButtonView");
                UncontainedButtonView uncontainedButtonView = (UncontainedButtonView) inflate;
                uncontainedButtonView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                UncontainedButtonHolderKt.bind$default(uncontainedButtonView, uncontainedButtonDTO, null, 2, null);
                uncontainedButtonView.setOnClickListener(new View.OnClickListener() { // from class: cc0.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Function1 function15;
                        Object obj2 = obj;
                        if (obj2 instanceof b.InterfaceC2133b) {
                            Function1 function16 = function13;
                            if (function16 != null) {
                                function16.invoke(obj2);
                                return;
                            }
                            return;
                        }
                        if (!(obj2 instanceof OtpDTO.HintButton) || (function15 = function14) == null) {
                            return;
                        }
                        function15.invoke(obj2);
                    }
                });
                String valueOf = String.valueOf(i12);
                C9861a.a(uncontainedButtonView, valueOf);
                C9861a.f(uncontainedButtonView, valueOf);
                linearLayout.addView(uncontainedButtonView);
                i12 = i13;
            }
        }
    }

    public static final void b(@NotNull TextAtomV2View textAtomV2View, @NotNull String title) {
        Intrinsics.checkNotNullParameter(textAtomV2View, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(title);
        TextDTO.TextAlignment textAlignment = TextDTO.TextAlignment.LEADING;
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
        TextHolderKt.bind$default(textAtomV2View, new TextDTO(ozonSpannableString, textAlignment, layoutPadding, layoutPadding, null, null, TextPreset.UI_H1, null, null, Integer.MAX_VALUE, null, null, null, false, null, null, null, null, null, 523696, null), null, 2, null);
    }

    public static final void c(@NotNull TextFieldCellView textFieldCellView, @NotNull CharSequence newText, @NotNull d interceptor) {
        Intrinsics.checkNotNullParameter(textFieldCellView, "<this>");
        Intrinsics.checkNotNullParameter(newText, "newText");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        interceptor.a(new b(textFieldCellView.getMainView().getInputViewGroup().getInputView(), newText));
    }

    public static final void d(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        try {
            view.postDelayed(new g(view, 3), 150L);
        } catch (Throwable th2) {
            b.a.c(Vb0.b.f28514a, th2);
        }
    }

    public static final URI e(@NotNull String str) {
        Object a11;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            r.Companion companion = r.INSTANCE;
            a11 = URI.create("https://" + str);
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (a11 instanceof r.b) {
            a11 = null;
        }
        return (URI) a11;
    }
}
