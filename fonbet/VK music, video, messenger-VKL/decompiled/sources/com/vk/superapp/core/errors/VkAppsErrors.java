package com.vk.superapp.core.errors;

import android.os.Bundle;
import com.ironsource.adapters.fyber.FyberConstants;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;
import xsna.asp;
import xsna.epx;
import xsna.on00;
import xsna.zrp;

/* compiled from: VkAppsErrors.kt */
/* loaded from: classes6.dex */
public final class VkAppsErrors {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkAppsErrors.kt */
    public static final class Client {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Client[] $VALUES;
        public static final Client ACCESS_DENIED;
        public static final Client ALREADY_IN_PROGRESS;
        public static final Client CONNECTION_LOST;
        public static final Client CUSTOM_ERROR;
        public static final Client INACTIVE_SCREEN;
        public static final Client INVALID_PARAMS;
        public static final Client LIMIT_REACHED;
        public static final Client MISSING_PARAMS;
        public static final Client NEED_USER_PERMISSIONS;
        public static final Client NO_ADS;
        public static final Client NO_PERMISSIONS;
        public static final Client UNKNOWN_ERROR;
        public static final Client UNSUPPORTED_PLATFORM;
        public static final Client USER_DENIED;
        private final int code;
        private final String description;
        private final String reason;
        private final String requestId;

        static {
            Client client = new Client("UNKNOWN_ERROR", 0, 1, FyberConstants.Logs.UNKNOWN_ERROR);
            UNKNOWN_ERROR = client;
            Client client2 = new Client("MISSING_PARAMS", 1, 2, "Missing required params");
            MISSING_PARAMS = client2;
            Client client3 = new Client("CONNECTION_LOST", 2, 3, "Connection lost");
            CONNECTION_LOST = client3;
            Client client4 = new Client("USER_DENIED", 3, 4, "User denied");
            USER_DENIED = client4;
            Client client5 = new Client("INVALID_PARAMS", 4, 5, "Invalid params");
            INVALID_PARAMS = client5;
            Client client6 = new Client("UNSUPPORTED_PLATFORM", 5, 6, "Unsupported platform");
            UNSUPPORTED_PLATFORM = client6;
            Client client7 = new Client("NO_PERMISSIONS", 6, 7, "No device permission");
            NO_PERMISSIONS = client7;
            Client client8 = new Client("NEED_USER_PERMISSIONS", 7, 8, "Need user permission");
            NEED_USER_PERMISSIONS = client8;
            Client client9 = new Client("INACTIVE_SCREEN", 8, 9, "This action cannot be performed in the background");
            INACTIVE_SCREEN = client9;
            Client client10 = new Client("LIMIT_REACHED", 9, 10, "Requests limit reached");
            LIMIT_REACHED = client10;
            Client client11 = new Client("ACCESS_DENIED", 10, 11, "Access denied");
            ACCESS_DENIED = client11;
            Client client12 = new Client("CUSTOM_ERROR", 11, 13, "Custom error");
            CUSTOM_ERROR = client12;
            Client client13 = new Client("ALREADY_IN_PROGRESS", 12, 14, "Request already in progress");
            ALREADY_IN_PROGRESS = client13;
            Client client14 = new Client("NO_ADS", 13, 20, "No ads");
            NO_ADS = client14;
            Client[] clientArr = {client, client2, client3, client4, client5, client6, client7, client8, client9, client10, client11, client12, client13, client14};
            $VALUES = clientArr;
            $ENTRIES = new asp(clientArr);
        }

        public Client() {
            throw null;
        }

        public Client(String str, int i, int i2, String str2) {
            this.code = i2;
            this.reason = str2;
            this.description = null;
            this.requestId = null;
        }

        public static JSONObject i(Client client, String str, Pair pair, int i) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                pair = null;
            }
            client.getClass();
            JSONObject put = new JSONObject().put("error_code", client.code).put("error_reason", client.reason);
            String str2 = client.description;
            if (str2 != null) {
                str = str2;
            }
            if (str != null) {
                put.put("error_description", str);
            }
            if (pair != null) {
                put.put((String) pair.i(), pair.j());
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_type", ErrorTypes.CLIENT.h());
            jSONObject.put("error_data", put);
            return jSONObject;
        }

        public static Client valueOf(String str) {
            return (Client) Enum.valueOf(Client.class, str);
        }

        public static Client[] values() {
            return (Client[]) $VALUES.clone();
        }

        public final String getDescription() {
            return this.description;
        }

        public final int h() {
            return this.code;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkAppsErrors.kt */
    public static final class ErrorTypes {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ErrorTypes[] $VALUES;
        public static final ErrorTypes API;
        public static final ErrorTypes AUTH;
        public static final ErrorTypes CLIENT;
        private final String type;

        static {
            ErrorTypes errorTypes = new ErrorTypes("CLIENT", 0, "client_error");
            CLIENT = errorTypes;
            ErrorTypes errorTypes2 = new ErrorTypes("API", 1, "api_error");
            API = errorTypes2;
            ErrorTypes errorTypes3 = new ErrorTypes("AUTH", 2, "auth_error");
            AUTH = errorTypes3;
            ErrorTypes[] errorTypesArr = {errorTypes, errorTypes2, errorTypes3};
            $VALUES = errorTypesArr;
            $ENTRIES = new asp(errorTypesArr);
        }

        public ErrorTypes(String str, int i, String str2) {
            this.type = str2;
        }

        public static ErrorTypes valueOf(String str) {
            return (ErrorTypes) Enum.valueOf(ErrorTypes.class, str);
        }

        public static ErrorTypes[] values() {
            return (ErrorTypes[]) $VALUES.clone();
        }

        public final String h() {
            return this.type;
        }
    }

    public static JSONObject a(int i, String str, Map map, Bundle bundle) {
        Set<String> set;
        JSONObject put = new JSONObject().put("error_code", i).put(SharedKt.PARAM_ERROR_MSG, str);
        if (bundle == null || (set = bundle.keySet()) == null) {
            set = EmptySet.b;
        }
        Iterator<String> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (!epx.f(next, SharedKt.PARAM_ACCESS_TOKEN)) {
                put.put(next, bundle != null ? bundle.get(next) : null);
            }
        }
        if (map != null) {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : map.entrySet()) {
                if (!epx.f(entry.getKey(), SharedKt.PARAM_ACCESS_TOKEN)) {
                    jSONArray.put(new JSONObject().put("key", entry.getKey()).put("value", entry.getValue()));
                }
            }
            put.put("request_params", jSONArray);
        }
        return new JSONObject().put("error_type", ErrorTypes.API.h()).put("error_data", put).put(CommonUrlParts.REQUEST_ID, (Object) null);
    }

    public static JSONObject b(Throwable th) {
        boolean z = th instanceof VKApiExecutionException;
        if (z && ((VKApiExecutionException) th).s() == -1) {
            return Client.i(Client.CONNECTION_LOST, null, null, 6);
        }
        if (z && ((VKApiExecutionException) th).s() == 24) {
            return Client.i(Client.USER_DENIED, null, null, 6);
        }
        if (!z) {
            return th instanceof JSONException ? Client.i(Client.INVALID_PARAMS, null, null, 6) : Client.i(Client.UNKNOWN_ERROR, null, null, 6);
        }
        VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
        return a(vKApiExecutionException.s(), vKApiExecutionException.s() == 14 ? vKApiExecutionException.u() : vKApiExecutionException.u(), vKApiExecutionException.z(), vKApiExecutionException.w());
    }

    public static JSONObject c(String str, String str2, String str3) {
        Client[] values = Client.values();
        int e = on00.e(values.length);
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Client client : values) {
            linkedHashMap.put(client.getDescription(), client);
        }
        JSONObject jSONObject = new JSONObject();
        Client client2 = (Client) linkedHashMap.get(str2);
        if (client2 == null) {
            client2 = Client.UNKNOWN_ERROR;
        }
        return new JSONObject().put("error_type", ErrorTypes.AUTH.h()).put("error_data", jSONObject.put("error", client2.h()).put("error_description", str).put("error_reason", str3));
    }
}
