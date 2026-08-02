package ru.ozon.app.android.session.userAdultModalMobile.presentation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.userAdultModalMobile.data.models.BirthdayActionRequest;
import ru.ozon.app.android.session.userAdultModalMobile.presentation.models.BirthdayActionParams;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobile/presentation/BirthdayModelBuilder;", "", "<init>", "()V", "apiDateFormatForPatchUser", "Ljava/text/SimpleDateFormat;", "buildRequest", "Lru/ozon/app/android/session/userAdultModalMobile/data/models/BirthdayActionRequest;", "params", "Lru/ozon/app/android/session/userAdultModalMobile/presentation/models/BirthdayActionParams;", "mapToRequiredFormat", "", "birthday", "", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BirthdayModelBuilder {

    @NotNull
    private final SimpleDateFormat apiDateFormatForPatchUser = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
    public static final int $stable = 8;

    private final String mapToRequiredFormat(long birthday) {
        String format = this.apiDateFormatForPatchUser.format(new Date(birthday));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    @NotNull
    public final BirthdayActionRequest buildRequest(@NotNull BirthdayActionParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        String actionName = params.getAction().getActionName();
        String mapToRequiredFormat = mapToRequiredFormat(params.getBirthday());
        Map<String, String> params2 = params.getAction().getParams();
        if (params2 == null) {
            params2 = U.c();
        }
        return new BirthdayActionRequest(actionName, mapToRequiredFormat, params2);
    }
}
