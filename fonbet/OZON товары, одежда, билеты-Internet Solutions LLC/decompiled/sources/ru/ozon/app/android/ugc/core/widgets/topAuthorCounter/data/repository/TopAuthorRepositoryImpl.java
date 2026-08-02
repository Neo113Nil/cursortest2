package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.repository;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.c;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.domain.TopAuthorRepository;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/repository/TopAuthorRepositoryImpl;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/domain/TopAuthorRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "needToShowAnimation", "", "Ljava/lang/Boolean;", "localDate", "Lorg/joda/time/DateTime;", "remoteDate", "saveNewTopAuthorDate", "", "dateTime", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TopAuthorRepositoryImpl implements TopAuthorRepository {
    private final DateTime localDate;
    private Boolean needToShowAnimation;

    @NotNull
    private final SharedPreferences sharedPreferences;

    public TopAuthorRepositoryImpl(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
        String string = sharedPreferences.getString("top_author_date", null);
        this.localDate = string != null ? DateTime.i(string) : null;
    }

    private final void saveNewTopAuthorDate(DateTime dateTime) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putString("top_author_date", dateTime.toString());
        edit.apply();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.domain.TopAuthorRepository
    public boolean needToShowAnimation(DateTime remoteDate) {
        Boolean bool = this.needToShowAnimation;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (remoteDate == null) {
            return false;
        }
        DateTime dateTime = this.localDate;
        if (dateTime != null) {
            if (remoteDate.getMillis() <= c.c(dateTime)) {
                return false;
            }
        }
        saveNewTopAuthorDate(remoteDate);
        this.needToShowAnimation = Boolean.TRUE;
        return true;
    }
}
