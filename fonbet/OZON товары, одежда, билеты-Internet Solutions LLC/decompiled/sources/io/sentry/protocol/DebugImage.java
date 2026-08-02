package io.sentry.protocol;

import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class DebugImage implements InterfaceC7220x0 {
    public static final String JVM = "jvm";
    public static final String PROGUARD = "proguard";
    private String arch;
    private String codeFile;
    private String codeId;
    private String debugFile;
    private String debugId;
    private String imageAddr;
    private Long imageSize;
    private String type;
    private Map<String, Object> unknown;
    private String uuid;

    public static final class a implements InterfaceC7174n0<DebugImage> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final DebugImage a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            DebugImage debugImage = new DebugImage();
            interfaceC7131c1.beginObject();
            HashMap hashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "debug_file":
                        debugImage.debugFile = interfaceC7131c1.k0();
                        break;
                    case "image_addr":
                        debugImage.imageAddr = interfaceC7131c1.k0();
                        break;
                    case "image_size":
                        debugImage.imageSize = interfaceC7131c1.D1();
                        break;
                    case "code_file":
                        debugImage.codeFile = interfaceC7131c1.k0();
                        break;
                    case "arch":
                        debugImage.arch = interfaceC7131c1.k0();
                        break;
                    case "type":
                        debugImage.type = interfaceC7131c1.k0();
                        break;
                    case "uuid":
                        debugImage.uuid = interfaceC7131c1.k0();
                        break;
                    case "debug_id":
                        debugImage.debugId = interfaceC7131c1.k0();
                        break;
                    case "code_id":
                        debugImage.codeId = interfaceC7131c1.k0();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, hashMap, nextName);
                        break;
                }
            }
            interfaceC7131c1.endObject();
            debugImage.setUnknown(hashMap);
            return debugImage;
        }
    }

    public String getArch() {
        return this.arch;
    }

    public String getCodeFile() {
        return this.codeFile;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getDebugFile() {
        return this.debugFile;
    }

    public String getDebugId() {
        return this.debugId;
    }

    public String getImageAddr() {
        return this.imageAddr;
    }

    public Long getImageSize() {
        return this.imageSize;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUuid() {
        return this.uuid;
    }

    @Override // io.sentry.InterfaceC7220x0
    public void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        if (this.uuid != null) {
            c7212v0.g("uuid");
            c7212v0.p(this.uuid);
        }
        if (this.type != null) {
            c7212v0.g("type");
            c7212v0.p(this.type);
        }
        if (this.debugId != null) {
            c7212v0.g("debug_id");
            c7212v0.p(this.debugId);
        }
        if (this.debugFile != null) {
            c7212v0.g("debug_file");
            c7212v0.p(this.debugFile);
        }
        if (this.codeId != null) {
            c7212v0.g("code_id");
            c7212v0.p(this.codeId);
        }
        if (this.codeFile != null) {
            c7212v0.g("code_file");
            c7212v0.p(this.codeFile);
        }
        if (this.imageAddr != null) {
            c7212v0.g("image_addr");
            c7212v0.p(this.imageAddr);
        }
        if (this.imageSize != null) {
            c7212v0.g("image_size");
            c7212v0.o(this.imageSize);
        }
        if (this.arch != null) {
            c7212v0.g("arch");
            c7212v0.p(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.unknown.get(str);
                c7212v0.g(str);
                c7212v0.m(iLogger, obj);
            }
        }
        c7212v0.d();
    }

    public void setArch(String str) {
        this.arch = str;
    }

    public void setCodeFile(String str) {
        this.codeFile = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setDebugFile(String str) {
        this.debugFile = str;
    }

    public void setDebugId(String str) {
        this.debugId = str;
    }

    public void setImageAddr(String str) {
        this.imageAddr = str;
    }

    public void setImageSize(Long l11) {
        this.imageSize = l11;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setImageSize(long j11) {
        this.imageSize = Long.valueOf(j11);
    }
}
