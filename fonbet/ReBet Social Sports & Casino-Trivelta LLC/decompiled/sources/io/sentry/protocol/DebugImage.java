package io.sentry.protocol;

import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class DebugImage implements G0 {
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

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public DebugImage a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            DebugImage debugImage = new DebugImage();
            interfaceC4809q1.m();
            HashMap hashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "debug_file":
                        debugImage.debugFile = interfaceC4809q1.a1();
                        break;
                    case "image_addr":
                        debugImage.imageAddr = interfaceC4809q1.a1();
                        break;
                    case "image_size":
                        debugImage.imageSize = interfaceC4809q1.U0();
                        break;
                    case "code_file":
                        debugImage.codeFile = interfaceC4809q1.a1();
                        break;
                    case "arch":
                        debugImage.arch = interfaceC4809q1.a1();
                        break;
                    case "type":
                        debugImage.type = interfaceC4809q1.a1();
                        break;
                    case "uuid":
                        debugImage.uuid = interfaceC4809q1.a1();
                        break;
                    case "debug_id":
                        debugImage.debugId = interfaceC4809q1.a1();
                        break;
                    case "code_id":
                        debugImage.codeId = interfaceC4809q1.a1();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        interfaceC4809q1.g1(iLogger, hashMap, f02);
                        break;
                }
            }
            interfaceC4809q1.t();
            debugImage.setUnknown(hashMap);
            return debugImage;
        }
    }

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

    @Override // io.sentry.G0
    public void serialize(@NotNull InterfaceC4813r1 interfaceC4813r1, @NotNull ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.uuid != null) {
            interfaceC4813r1.d("uuid").e(this.uuid);
        }
        if (this.type != null) {
            interfaceC4813r1.d("type").e(this.type);
        }
        if (this.debugId != null) {
            interfaceC4813r1.d("debug_id").e(this.debugId);
        }
        if (this.debugFile != null) {
            interfaceC4813r1.d("debug_file").e(this.debugFile);
        }
        if (this.codeId != null) {
            interfaceC4813r1.d("code_id").e(this.codeId);
        }
        if (this.codeFile != null) {
            interfaceC4813r1.d("code_file").e(this.codeFile);
        }
        if (this.imageAddr != null) {
            interfaceC4813r1.d("image_addr").e(this.imageAddr);
        }
        if (this.imageSize != null) {
            interfaceC4813r1.d("image_size").i(this.imageSize);
        }
        if (this.arch != null) {
            interfaceC4813r1.d("arch").e(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.unknown.get(str));
            }
        }
        interfaceC4813r1.t();
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

    public void setImageSize(@Nullable Long l10) {
        this.imageSize = l10;
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

    public void setImageSize(long j10) {
        this.imageSize = Long.valueOf(j10);
    }
}
