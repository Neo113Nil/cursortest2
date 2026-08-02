package ru.ozon.android.ozonLogger.core.internal;

import Am.C2438a;
import id.d;
import id.e;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.core.internal.StandardFieldsContract;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\"\n\u0002\u0010\"\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\b\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00040\u00070\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001b\u0010\u0011\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0014\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001b\u0010\u0017\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001b\u0010\u001a\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010R\u001b\u0010\u001d\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010R\u001b\u0010 \u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001f\u0010\u0010R\u001b\u0010#\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u000e\u001a\u0004\b\"\u0010\u0010R\u001b\u0010&\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u000e\u001a\u0004\b%\u0010\u0010R\u001b\u0010)\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u000e\u001a\u0004\b(\u0010\u0010R\u001b\u0010,\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u000e\u001a\u0004\b+\u0010\u0010R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040-8F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ozon/android/ozonLogger/core/internal/StandardFieldsContract;", "", "<init>", "()V", "", "nameOverride", "Lid/d;", "Lid/e;", "field", "(Ljava/lang/String;)Lid/d;", "", "_allFields", "Ljava/util/Set;", "timestamp$delegate", "Lid/e;", "getTimestamp", "()Ljava/lang/String;", "timestamp", "level$delegate", "getLevel", "level", "message$delegate", "getMessage", "message", "service$delegate", "getService", "service", "platform$delegate", "getPlatform", "platform", "team$delegate", "getTeam", "team", "group$delegate", "getGroup", "group", "sessionId$delegate", "getSessionId", "sessionId", "appVersion$delegate", "getAppVersion", "appVersion", "env$delegate", "getEnv", "env", "", "getAllFields", "()Ljava/util/Set;", "allFields", "ozon-logger-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class StandardFieldsContract {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(StandardFieldsContract.class, "timestamp", "getTimestamp()Ljava/lang/String;", 0), C2438a.c(StandardFieldsContract.class, "level", "getLevel()Ljava/lang/String;", 0), C2438a.c(StandardFieldsContract.class, "message", "getMessage()Ljava/lang/String;", 0), C2438a.c(StandardFieldsContract.class, "service", "getService()Ljava/lang/String;", 0), C2438a.c(StandardFieldsContract.class, "platform", "getPlatform()Ljava/lang/String;", 0), C2438a.c(StandardFieldsContract.class, "team", "getTeam()Ljava/lang/String;", 0), C2438a.c(StandardFieldsContract.class, "group", "getGroup()Ljava/lang/String;", 0), C2438a.c(StandardFieldsContract.class, "sessionId", "getSessionId()Ljava/lang/String;", 0), C2438a.c(StandardFieldsContract.class, "appVersion", "getAppVersion()Ljava/lang/String;", 0), C2438a.c(StandardFieldsContract.class, "env", "getEnv()Ljava/lang/String;", 0)};

    @NotNull
    private final Set<String> _allFields = new LinkedHashSet();

    /* renamed from: appVersion$delegate, reason: from kotlin metadata */
    @NotNull
    private final e appVersion;

    /* renamed from: env$delegate, reason: from kotlin metadata */
    @NotNull
    private final e env;

    /* renamed from: group$delegate, reason: from kotlin metadata */
    @NotNull
    private final e group;

    /* renamed from: level$delegate, reason: from kotlin metadata */
    @NotNull
    private final e level;

    /* renamed from: message$delegate, reason: from kotlin metadata */
    @NotNull
    private final e message;

    /* renamed from: platform$delegate, reason: from kotlin metadata */
    @NotNull
    private final e platform;

    /* renamed from: service$delegate, reason: from kotlin metadata */
    @NotNull
    private final e service;

    /* renamed from: sessionId$delegate, reason: from kotlin metadata */
    @NotNull
    private final e sessionId;

    /* renamed from: team$delegate, reason: from kotlin metadata */
    @NotNull
    private final e team;

    /* renamed from: timestamp$delegate, reason: from kotlin metadata */
    @NotNull
    private final e timestamp;

    public StandardFieldsContract() {
        d field$default = field$default(this, null, 1, null);
        m<?>[] mVarArr = $$delegatedProperties;
        this.timestamp = (e) field$default.a(this, mVarArr[0]);
        this.level = (e) field$default(this, null, 1, null).a(this, mVarArr[1]);
        this.message = (e) field$default(this, null, 1, null).a(this, mVarArr[2]);
        this.service = (e) field$default(this, null, 1, null).a(this, mVarArr[3]);
        this.platform = (e) field$default(this, null, 1, null).a(this, mVarArr[4]);
        this.team = (e) field$default(this, null, 1, null).a(this, mVarArr[5]);
        this.group = (e) field$default(this, null, 1, null).a(this, mVarArr[6]);
        this.sessionId = (e) field$default(this, null, 1, null).a(this, mVarArr[7]);
        this.appVersion = field("app_version").a(this, mVarArr[8]);
        this.env = (e) field$default(this, null, 1, null).a(this, mVarArr[9]);
    }

    public static /* synthetic */ d field$default(StandardFieldsContract standardFieldsContract, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: field");
        }
        if ((i11 & 1) != 0) {
            str = null;
        }
        return standardFieldsContract.field(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e field$lambda$1(final String str, StandardFieldsContract standardFieldsContract, Object obj, m property) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (str == null) {
            str = property.getName();
        }
        standardFieldsContract._allFields.add(str);
        return new e() { // from class: Ej.t
            @Override // id.e
            public final Object getValue(Object obj2, kotlin.reflect.m mVar) {
                String field$lambda$1$lambda$0;
                field$lambda$1$lambda$0 = StandardFieldsContract.field$lambda$1$lambda$0(str, obj2, mVar);
                return field$lambda$1$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String field$lambda$1$lambda$0(String str, Object obj, m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<unused var>");
        return str;
    }

    @NotNull
    protected final d<Object, e<Object, String>> field(final String nameOverride) {
        return new d() { // from class: Ej.s
            @Override // id.d
            public final Object a(Object obj, kotlin.reflect.m mVar) {
                id.e field$lambda$1;
                field$lambda$1 = StandardFieldsContract.field$lambda$1(nameOverride, this, (StandardFieldsContract) obj, mVar);
                return field$lambda$1;
            }
        };
    }

    @NotNull
    public final Set<String> getAllFields() {
        return C7714v.Y0(this._allFields);
    }

    @NotNull
    public final String getAppVersion() {
        return (String) this.appVersion.getValue(this, $$delegatedProperties[8]);
    }

    @NotNull
    public final String getEnv() {
        return (String) this.env.getValue(this, $$delegatedProperties[9]);
    }

    @NotNull
    public final String getGroup() {
        return (String) this.group.getValue(this, $$delegatedProperties[6]);
    }

    @NotNull
    public final String getLevel() {
        return (String) this.level.getValue(this, $$delegatedProperties[1]);
    }

    @NotNull
    public final String getMessage() {
        return (String) this.message.getValue(this, $$delegatedProperties[2]);
    }

    @NotNull
    public final String getPlatform() {
        return (String) this.platform.getValue(this, $$delegatedProperties[4]);
    }

    @NotNull
    public final String getService() {
        return (String) this.service.getValue(this, $$delegatedProperties[3]);
    }

    @NotNull
    public final String getSessionId() {
        return (String) this.sessionId.getValue(this, $$delegatedProperties[7]);
    }

    @NotNull
    public final String getTeam() {
        return (String) this.team.getValue(this, $$delegatedProperties[5]);
    }

    @NotNull
    public final String getTimestamp() {
        return (String) this.timestamp.getValue(this, $$delegatedProperties[0]);
    }
}
