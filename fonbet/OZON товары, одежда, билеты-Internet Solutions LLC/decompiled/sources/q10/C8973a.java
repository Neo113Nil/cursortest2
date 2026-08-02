package q10;

import D00.g;
import a00.C4908c;
import a00.C4911f;
import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.model.Action;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

/* renamed from: q10.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8973a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4911f f81376a;

    /* renamed from: q10.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C1372a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f81377b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f81378c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1372a(g gVar, r rVar) {
            super(0);
            this.f81377b = gVar;
            this.f81378c = rVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            g incidents = this.f81377b;
            Intrinsics.checkNotNullParameter(incidents, "incidents");
            Bundle bundle = new Bundle();
            bundle.putParcelable("INCIDENTS_PARAM", incidents);
            e eVar = new e();
            eVar.setArguments(bundle);
            eVar.show(this.f81378c.getSupportFragmentManager(), UUID.randomUUID().toString());
            return Unit.f71690a;
        }
    }

    /* renamed from: q10.a$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f81379b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f81380c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(r rVar, String str) {
            super(0);
            this.f81379b = rVar;
            this.f81380c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ClipData newPlainText;
            Application application = this.f81379b.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            ClipboardManager clipboardManager = (ClipboardManager) application.getSystemService("clipboard");
            if (clipboardManager != null && (newPlainText = ClipData.newPlainText("StackTrace", this.f81380c)) != null) {
                clipboardManager.setPrimaryClip(newPlainText);
            }
            return Unit.f71690a;
        }
    }

    public C8973a(@NotNull C4911f ownerContainer) {
        Intrinsics.checkNotNullParameter(ownerContainer, "ownerContainer");
        this.f81376a = ownerContainer;
    }

    static void c(C8973a c8973a, r rVar, C4908c c4908c, String str, Action action, long j11) {
        c8973a.getClass();
        ViewGroup rootView = ContextExtKt.getRootView(rVar);
        if (rootView != null) {
            FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(str), null, null, null, null, null, null, action, null, null, null, Long.valueOf(j11), null, null, c4908c, 56666, null).show();
        }
    }

    public final void a(@NotNull g incidents) {
        Intrinsics.checkNotNullParameter(incidents, "incidents");
        C4911f c4911f = this.f81376a;
        r a11 = c4911f.a();
        if (a11 == null) {
            return;
        }
        c(this, a11, c4911f.g(), incidents.b(), new Action("Посмотреть", true, new C1372a(incidents, a11)), 6000L);
    }

    public final void b(@NotNull String message, @NotNull String stackTrace) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
        C4911f c4911f = this.f81376a;
        r a11 = c4911f.a();
        if (a11 == null) {
            return;
        }
        c(this, a11, c4911f.g(), message, new Action("Скопировать stackTrace", true, new b(a11, stackTrace)), 10000L);
    }
}
