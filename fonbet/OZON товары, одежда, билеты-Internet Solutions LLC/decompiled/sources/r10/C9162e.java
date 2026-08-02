package r10;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.f;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr10/e;", "Landroidx/fragment/app/k;", "<init>", "()V", "composer-recycler-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: r10.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9162e extends DialogInterfaceOnCancelListenerC5390k {
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public final Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        C9159b c9159b = arguments != null ? (C9159b) arguments.getParcelable("ru.ozon.composer.ui.debug.pageinfo.PageDebugInfo") : null;
        if (c9159b == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("url: " + c9159b.g());
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("pageType: " + c9159b.d());
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("pageTypeTracking: " + c9159b.e());
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("ruleId: " + c9159b.f());
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("layoutId: " + c9159b.b());
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("layoutVersion: " + c9159b.c());
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("");
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("bottomPrefetchDepth: " + c9159b.a());
        final String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        f.a aVar = new f.a(requireContext(), R.style.Theme_AppCompat_DayNight_Dialog_Alert);
        aVar.p(R.string.page_info);
        aVar.f(sb3);
        f create = aVar.setPositiveButton(R.string.page_info_copy, new DialogInterface.OnClickListener() { // from class: r10.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                ClipData newPlainText;
                Context requireContext = C9162e.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                Intrinsics.checkNotNullParameter(requireContext, "<this>");
                Intrinsics.checkNotNullParameter("", "label");
                String value = sb3;
                Intrinsics.checkNotNullParameter(value, "value");
                ClipboardManager clipboardManager = (ClipboardManager) requireContext.getSystemService("clipboard");
                if (clipboardManager == null || (newPlainText = ClipData.newPlainText("", value)) == null) {
                    return;
                }
                clipboardManager.setPrimaryClip(newPlainText);
            }
        }).setNegativeButton(R.string.page_info_close, new DialogInterface.OnClickListener() { // from class: r10.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C9162e.this.dismiss();
            }
        }).b(true).create();
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return create;
    }
}
