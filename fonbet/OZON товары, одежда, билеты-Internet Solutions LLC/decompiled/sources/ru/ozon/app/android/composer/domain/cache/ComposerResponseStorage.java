package ru.ozon.app.android.composer.domain.cache;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J1\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH&¢\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH&J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fH&J\b\u0010\u0012\u001a\u00020\u0003H&¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/composer/domain/cache/ComposerResponseStorage;", "", "saveResponse", "", "cacheValue", "", "params", "", "dateTime", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;[Ljava/lang/Object;Lorg/joda/time/DateTime;)V", "findResponseMockDirectory", "Ljava/io/File;", "key", "", "getResponseMock", "Lru/ozon/app/android/composer/domain/cache/CacheBox;", "mockDir", "clearCache", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ComposerResponseStorage {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/composer/domain/cache/ComposerResponseStorage$Companion;", "", "<init>", "()V", "generateKey", "", "params", "", "generateKey$composer_prodGoogleAllVendorsRelease", "([Ljava/lang/Object;)I", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final int generateKey$composer_prodGoogleAllVendorsRelease(@NotNull Object[] params) {
            Intrinsics.checkNotNullParameter(params, "params");
            String str = "";
            for (Object obj : params) {
                str = str + "." + obj;
            }
            return str.hashCode();
        }
    }

    void clearCache();

    File findResponseMockDirectory(int key);

    @NotNull
    CacheBox getResponseMock(int key, @NotNull File mockDir);

    void saveResponse(@NotNull String cacheValue, @NotNull Object[] params, @NotNull DateTime dateTime);
}
