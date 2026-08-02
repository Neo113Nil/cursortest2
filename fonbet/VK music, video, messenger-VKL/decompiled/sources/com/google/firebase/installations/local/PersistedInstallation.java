package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.vhr;

/* loaded from: classes.dex */
public final class PersistedInstallation {
    public File a;

    @NonNull
    public final vhr b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RegistrationStatus {
        private static final /* synthetic */ RegistrationStatus[] $VALUES;
        public static final RegistrationStatus ATTEMPT_MIGRATION;
        public static final RegistrationStatus NOT_GENERATED;
        public static final RegistrationStatus REGISTERED;
        public static final RegistrationStatus REGISTER_ERROR;
        public static final RegistrationStatus UNREGISTERED;

        static {
            RegistrationStatus registrationStatus = new RegistrationStatus("ATTEMPT_MIGRATION", 0);
            ATTEMPT_MIGRATION = registrationStatus;
            RegistrationStatus registrationStatus2 = new RegistrationStatus("NOT_GENERATED", 1);
            NOT_GENERATED = registrationStatus2;
            RegistrationStatus registrationStatus3 = new RegistrationStatus("UNREGISTERED", 2);
            UNREGISTERED = registrationStatus3;
            RegistrationStatus registrationStatus4 = new RegistrationStatus("REGISTERED", 3);
            REGISTERED = registrationStatus4;
            RegistrationStatus registrationStatus5 = new RegistrationStatus("REGISTER_ERROR", 4);
            REGISTER_ERROR = registrationStatus5;
            $VALUES = new RegistrationStatus[]{registrationStatus, registrationStatus2, registrationStatus3, registrationStatus4, registrationStatus5};
        }

        public RegistrationStatus() {
            throw null;
        }

        public static RegistrationStatus valueOf(String str) {
            return (RegistrationStatus) Enum.valueOf(RegistrationStatus.class, str);
        }

        public static RegistrationStatus[] values() {
            return (RegistrationStatus[]) $VALUES.clone();
        }
    }

    public PersistedInstallation(@NonNull vhr vhrVar) {
        this.b = vhrVar;
    }

    public final File a() {
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        vhr vhrVar = this.b;
                        vhrVar.a();
                        this.a = new File(vhrVar.a.getFilesDir(), "PersistedInstallation." + this.b.f() + ".json");
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    @NonNull
    public final void b(@NonNull a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.b);
            jSONObject.put("Status", aVar.c.ordinal());
            jSONObject.put("AuthToken", aVar.d);
            jSONObject.put("RefreshToken", aVar.e);
            jSONObject.put("TokenCreationEpochInSecs", aVar.g);
            jSONObject.put("ExpiresInSecs", aVar.f);
            jSONObject.put("FisError", aVar.h);
            vhr vhrVar = this.b;
            vhrVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", vhrVar.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(C.UTF8_NAME));
            fileOutputStream.close();
            if (createTempFile.renameTo(a())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @NonNull
    public final a c() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        RegistrationStatus registrationStatus = RegistrationStatus.ATTEMPT_MIGRATION;
        int optInt = jSONObject.optInt("Status", registrationStatus.ordinal());
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i = b.a;
        if (registrationStatus == null) {
            throw new NullPointerException("Null registrationStatus");
        }
        RegistrationStatus registrationStatus2 = RegistrationStatus.values()[optInt];
        if (registrationStatus2 != null) {
            return new a(optString, registrationStatus2, optString2, optString3, optLong2, optLong, optString4);
        }
        throw new NullPointerException("Null registrationStatus");
    }
}
