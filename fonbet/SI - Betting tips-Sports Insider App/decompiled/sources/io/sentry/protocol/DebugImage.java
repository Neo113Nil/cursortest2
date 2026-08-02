package io.sentry.protocol;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import java.io.IOException;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class DebugImage implements c2 {
    public static final String JVM = "jvm";
    public static final String PROGUARD = "proguard";

    @Nullable
    private String arch;

    @Nullable
    private String codeFile;

    @Nullable
    private String codeId;

    @Nullable
    private String debugFile;

    @Nullable
    private String debugId;

    @Nullable
    private String imageAddr;

    @Nullable
    private Long imageSize;

    @Nullable
    private String type;

    @Nullable
    private Map<String, Object> unknown;

    @Nullable
    private String uuid;

    @Nullable
    public String getArch() {
        return this.arch;
    }

    @Nullable
    public String getCodeFile() {
        return this.codeFile;
    }

    @Nullable
    public String getCodeId() {
        return this.codeId;
    }

    @Nullable
    public String getDebugFile() {
        return this.debugFile;
    }

    @Nullable
    public String getDebugId() {
        return this.debugId;
    }

    @Nullable
    public String getImageAddr() {
        return this.imageAddr;
    }

    @Nullable
    public Long getImageSize() {
        return this.imageSize;
    }

    @Nullable
    public String getType() {
        return this.type;
    }

    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Nullable
    public String getUuid() {
        return this.uuid;
    }

    @Override // io.sentry.c2
    public void serialize(@NotNull b3 b3Var, @NotNull ILogger iLogger) throws IOException {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        if (this.uuid != null) {
            aVar.u(CommonUrlParts.UUID);
            aVar.K(this.uuid);
        }
        if (this.type != null) {
            aVar.u("type");
            aVar.K(this.type);
        }
        if (this.debugId != null) {
            aVar.u("debug_id");
            aVar.K(this.debugId);
        }
        if (this.debugFile != null) {
            aVar.u("debug_file");
            aVar.K(this.debugFile);
        }
        if (this.codeId != null) {
            aVar.u("code_id");
            aVar.K(this.codeId);
        }
        if (this.codeFile != null) {
            aVar.u("code_file");
            aVar.K(this.codeFile);
        }
        if (this.imageAddr != null) {
            aVar.u("image_addr");
            aVar.K(this.imageAddr);
        }
        if (this.imageSize != null) {
            aVar.u("image_size");
            aVar.J(this.imageSize);
        }
        if (this.arch != null) {
            aVar.u("arch");
            aVar.K(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.unknown.get(str);
                aVar.u(str);
                aVar.H(iLogger, obj);
            }
        }
        aVar.o();
    }

    public void setArch(@Nullable String str) {
        this.arch = str;
    }

    public void setCodeFile(@Nullable String str) {
        this.codeFile = str;
    }

    public void setCodeId(@Nullable String str) {
        this.codeId = str;
    }

    public void setDebugFile(@Nullable String str) {
        this.debugFile = str;
    }

    public void setDebugId(@Nullable String str) {
        this.debugId = str;
    }

    public void setImageAddr(@Nullable String str) {
        this.imageAddr = str;
    }

    public void setImageSize(@Nullable Long l6) {
        this.imageSize = l6;
    }

    public void setType(@Nullable String str) {
        this.type = str;
    }

    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(@Nullable String str) {
        this.uuid = str;
    }

    public void setImageSize(long j) {
        this.imageSize = Long.valueOf(j);
    }
}
