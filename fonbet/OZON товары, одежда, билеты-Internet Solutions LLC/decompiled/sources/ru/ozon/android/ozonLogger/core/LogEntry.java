package ru.ozon.android.ozonLogger.core;

import Sc.InterfaceC3999a;
import Sc.o;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\b&\u0018\u0000 72\u00020\u0001:\u00018BG\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B=\b\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH'¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH\u0007¢\u0006\u0004\b!\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b/\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u00102R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00103\u001a\u0004\b\u000e\u00104\"\u0004\b5\u00106¨\u00069"}, d2 = {"Lru/ozon/android/ozonLogger/core/LogEntry;", "", "Ljava/util/UUID;", "uuid", "", "timestamp", "Lru/ozon/android/ozonLogger/core/c;", "level", "", "tag", "message", "Lru/ozon/android/ozonLogger/core/a;", "customFields", "", "isLocal", "<init>", "(Ljava/util/UUID;JLru/ozon/android/ozonLogger/core/c;Ljava/lang/String;Ljava/lang/String;Lru/ozon/android/ozonLogger/core/a;Ljava/lang/Boolean;)V", "(Ljava/util/UUID;JLru/ozon/android/ozonLogger/core/c;Ljava/lang/String;Lru/ozon/android/ozonLogger/core/a;Ljava/lang/Boolean;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lru/ozon/android/ozonLogger/core/i;", "format", "formatted", "(Lru/ozon/android/ozonLogger/core/i;)Ljava/lang/String;", "Lorg/json/JSONObject;", "asJSONObject", "()Lorg/json/JSONObject;", "asJSONString", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "J", "getTimestamp", "()J", "Lru/ozon/android/ozonLogger/core/c;", "getLevel", "()Lru/ozon/android/ozonLogger/core/c;", "Ljava/lang/String;", "getTag", "setTag", "(Ljava/lang/String;)V", "getMessage", "Lru/ozon/android/ozonLogger/core/a;", "getCustomFields", "()Lru/ozon/android/ozonLogger/core/a;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setLocal", "(Ljava/lang/Boolean;)V", "Companion", "a", "ozon-logger-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class LogEntry {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final SimpleDateFormat rfc3339Formatter;

    @NotNull
    private static final SimpleDateFormat timeFormatter;
    private final a customFields;
    private Boolean isLocal;

    @NotNull
    private final c level;

    @NotNull
    private final String message;
    private String tag;
    private final long timestamp;

    @NotNull
    private final UUID uuid;

    /* renamed from: ru.ozon.android.ozonLogger.core.LogEntry$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: ru.ozon.android.ozonLogger.core.LogEntry$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1728a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f92034a;

            static {
                int[] iArr = new int[i.values().length];
                try {
                    iArr[i.COMPACT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[i.FULL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f92034a = iArr;
            }
        }

        @NotNull
        public static String a(long j11, @NotNull i format) {
            Intrinsics.checkNotNullParameter(format, "format");
            int i11 = C1728a.f92034a[format.ordinal()];
            if (i11 == 1) {
                String format2 = LogEntry.timeFormatter.format(Long.valueOf(j11));
                Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                return format2;
            }
            if (i11 != 2) {
                throw new o();
            }
            String format3 = LogEntry.rfc3339Formatter.format(Long.valueOf(j11));
            Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
            return format3;
        }
    }

    static {
        Locale locale = Locale.ENGLISH;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", locale);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        rfc3339Formatter = simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm:ss.SSS", locale);
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        timeFormatter = simpleDateFormat2;
    }

    protected LogEntry(@NotNull UUID uuid, long j11, @NotNull c level, String str, @NotNull String message, a aVar, Boolean bool) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        this.uuid = uuid;
        this.timestamp = j11;
        this.level = level;
        this.tag = str;
        this.message = message;
        this.customFields = aVar;
        this.isLocal = bool;
    }

    @NotNull
    public abstract JSONObject asJSONObject();

    @NotNull
    public final String asJSONString() {
        String jSONObject = asJSONObject().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return jSONObject;
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LogEntry) && Intrinsics.d(this.uuid, ((LogEntry) other).uuid);
    }

    @NotNull
    public abstract String formatted(@NotNull i format);

    public final a getCustomFields() {
        return this.customFields;
    }

    @NotNull
    public final c getLevel() {
        return this.level;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final String getTag() {
        return this.tag;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final UUID getUuid() {
        return this.uuid;
    }

    public final int hashCode() {
        return this.uuid.hashCode();
    }

    /* renamed from: isLocal, reason: from getter */
    public final Boolean getIsLocal() {
        return this.isLocal;
    }

    public final void setLocal(Boolean bool) {
        this.isLocal = bool;
    }

    public final void setTag(String str) {
        this.tag = str;
    }

    @NotNull
    public abstract String toString();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC3999a
    protected LogEntry(@NotNull UUID uuid, long j11, @NotNull c level, @NotNull String message, a aVar, Boolean bool) {
        this(uuid, j11, level, null, message, aVar, bool);
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
