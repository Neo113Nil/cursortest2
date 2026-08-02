package ru.ozon.fintech.features.tabber.ui;

import B90.e0;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Toast;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q80.AbstractC8997a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/fintech/features/tabber/ui/PreferenceViewListenerQa;", "Lq80/a;", "tabber_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreferenceViewListenerQa extends AbstractC8997a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f96345d = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreferenceViewListenerQa(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // q80.AbstractC8997a
    public final void a() {
        Toast.makeText(getContext().getApplicationContext(), "Сейчас запустим preferences!!", 0).show();
        postDelayed(new e0(this, 4), 2000L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PreferenceViewListenerQa(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, 0);
        attributeSet = (i11 & 2) != 0 ? null : attributeSet;
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
