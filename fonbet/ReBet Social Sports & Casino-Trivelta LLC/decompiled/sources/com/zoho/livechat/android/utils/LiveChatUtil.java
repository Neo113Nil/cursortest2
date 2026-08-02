package com.zoho.livechat.android.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.twilio.voice.Constants;
import com.twilio.voice.EventGroupType;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import com.zoho.livechat.android.VisitorChat;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.listeners.InitListener;
import com.zoho.livechat.android.listeners.OperatorImageListener;
import com.zoho.livechat.android.listeners.RegisterListener;
import com.zoho.livechat.android.listeners.SalesIQChatListener;
import com.zoho.livechat.android.listeners.SalesIQListener;
import com.zoho.livechat.android.listeners.UnRegisterListener;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.common.ui.activities.SalesIQActivity;
import com.zoho.livechat.android.modules.common.ui.models.SalesIQGuestUser;
import com.zoho.livechat.android.modules.common.ui.models.SalesIQUser;
import com.zoho.livechat.android.modules.conversations.data.local.entities.Bot;
import com.zoho.livechat.android.modules.conversations.data.local.entities.WaitingChatDetails;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.provider.b;
import com.zoho.livechat.android.ui.activities.ChatActivity;
import com.zoho.livechat.android.utils.N;
import com.zoho.salesiqembed.ZohoSalesIQ;
import com.zoho.salesiqembed.android.tracking.UTSUtil;
import ie.EnumC4544a;
import ie.b;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import l.AbstractC5335a;
import l0.AbstractC5338c;
import og.AbstractC5896h;
import org.json.JSONObject;
import rd.C6218a;
import sd.EnumC6361a;
import ug.AbstractC6574b;
import ve.InterfaceC6686a;
import we.d;
import xe.C6822a;
import zf.C6966g;

/* loaded from: classes4.dex */
public class LiveChatUtil {
    private static final String REGEX_URL = "(?:(href|src)=[\"']?)?((https?:\\/\\/(?:www\\.)?|www\\.)[a-z0-9][^@]*?)(?=[\\s\"'<]|$)|mailto:([^\\?]*)";
    private static final String REGISTER_VISITOR_PATTERN = "^[A-Za-z0-9_@.\\-]{1,100}$";
    private static String currentChatId;
    private static ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);
    private static int badgeCount = -1;
    public static String platformName = null;

    public class a implements L4.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Boolean f44403a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ OperatorImageListener f44404b;
        final /* synthetic */ Drawable[] val$image;

        public a(Boolean bool, OperatorImageListener operatorImageListener, Drawable[] drawableArr) {
            this.f44403a = bool;
            this.f44404b = operatorImageListener;
            this.val$image = drawableArr;
        }

        @Override // L4.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean f(Drawable drawable, Object obj, M4.j jVar, com.bumptech.glide.load.a aVar, boolean z10) {
            this.f44404b.onSuccess(drawable);
            return true;
        }

        @Override // L4.g
        public boolean k(com.bumptech.glide.load.engine.q qVar, Object obj, M4.j jVar, boolean z10) {
            if (this.f44403a.booleanValue()) {
                this.f44404b.onSuccess(this.val$image[0]);
                return true;
            }
            this.f44404b.onFailure(607, "image loading failed");
            return true;
        }
    }

    public class b implements RegisterListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bd.b f44405a;

        public b(Bd.b bVar) {
            this.f44405a = bVar;
        }

        @Override // com.zoho.livechat.android.listeners.RegisterListener
        public void onFailure(int i10, String str) {
        }

        @Override // com.zoho.livechat.android.listeners.RegisterListener
        public void onSuccess() {
            ne.l.f(new b.o(((SalesIQUser) this.f44405a).getUniqueVisitorId()));
            LiveChatUtil.log("MobilistenEncryptedSharedPreferences- re-registering visitor success");
            if (Yd.a.o().contains("are_new_encrypted_keys_present_in_default_preferences") && Yd.a.o().getBoolean("are_new_encrypted_keys_present_in_default_preferences", true)) {
                Ye.d.o(De.a.IsEncryptedSharedPreferenceFailureAcknowledged, true).b(true);
            } else {
                Yd.a.o().edit().remove("is_encrypted_shared_preference_failure_acknowledged").commit();
            }
        }
    }

    public static /* synthetic */ class c {
        static final /* synthetic */ int[] $SwitchMap$com$zoho$livechat$android$constants$ConversationType;
        static final /* synthetic */ int[] $SwitchMap$com$zoho$livechat$android$modules$messages$domain$entities$Message$Status;

        static {
            int[] iArr = new int[Message.f.values().length];
            $SwitchMap$com$zoho$livechat$android$modules$messages$domain$entities$Message$Status = iArr;
            try {
                iArr[Message.f.Sending.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$modules$messages$domain$entities$Message$Status[Message.f.WaitingForWms.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$modules$messages$domain$entities$Message$Status[Message.f.Uploading.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$modules$messages$domain$entities$Message$Status[Message.f.Sent.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$modules$messages$domain$entities$Message$Status[Message.f.Failure.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$modules$messages$domain$entities$Message$Status[Message.f.WmsFailure.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[EnumC6361a.values().length];
            $SwitchMap$com$zoho$livechat$android$constants$ConversationType = iArr2;
            try {
                iArr2[EnumC6361a.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$constants$ConversationType[EnumC6361a.WAITING.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$constants$ConversationType[EnumC6361a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$constants$ConversationType[EnumC6361a.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$constants$ConversationType[EnumC6361a.MISSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$constants$ConversationType[EnumC6361a.ENDED.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static /* synthetic */ void a(boolean z10, InitListener initListener, String str) {
        if (z10) {
            initListener.onInitSuccess();
        } else {
            Object d10 = AbstractC6574b.d(str);
            Hashtable hashtable = d10 instanceof Hashtable ? (Hashtable) d10 : null;
            Object obj = hashtable != null ? hashtable.get("error") : null;
            Hashtable hashtable2 = obj instanceof Hashtable ? (Hashtable) obj : null;
            int i10 = 601;
            String str2 = "operation failed";
            if (hashtable2 != null) {
                if (hashtable2.containsKey(EventKeys.ERROR_CODE)) {
                    int intValue = getInteger(hashtable2.get(EventKeys.ERROR_CODE)).intValue();
                    if (intValue == 1019 || intValue == 1433 || intValue == 1409 || intValue == 1005) {
                        i10 = 602;
                        str2 = "Invalid app key, access key, or registered bundle id";
                    } else if (intValue == 1058) {
                        i10 = 610;
                        str2 = "inactive salesiq portal";
                    } else if (intValue == 1431) {
                        i10 = 604;
                        str2 = "user not allowed";
                    } else if (intValue == 1412) {
                        i10 = 609;
                        str2 = "outdated mobilisten version";
                    } else if (intValue == 1406) {
                        i10 = 611;
                        str2 = "brand disabled";
                    } else if (intValue == 1418) {
                        i10 = 612;
                        str2 = "channel disabled";
                    } else if (intValue == 1434) {
                        i10 = 613;
                        str2 = "accessKey disabled";
                    } else if (!TextUtils.isEmpty("operation failed")) {
                        str2 = getString(hashtable2.get("message"));
                        i10 = intValue;
                    }
                }
            } else if (d10 != null && (obj instanceof String)) {
                str2 = (String) obj;
            }
            initListener.onInitError(i10, str2);
        }
        ZohoLiveChat.getApplicationManager().T(null);
    }

    public static void applyDepartmentToChat(SalesIQChat salesIQChat) {
        Channel.Department department = (Channel.Department) AbstractC3945n.i(false, null, salesIQChat.getConvID()).get(0);
        salesIQChat.setDeptid(department.getId());
        salesIQChat.setDepartmentName(department.getName());
    }

    public static void applyFontForToolbarTitle(Toolbar toolbar) {
        try {
            int childCount = toolbar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = toolbar.getChildAt(i10);
                if (childAt instanceof TextView) {
                    TextView textView = (TextView) childAt;
                    if (textView.getText().equals(toolbar.getTitle())) {
                        textView.setTypeface(C6218a.P());
                        textView.setIncludeFontPadding(false);
                        textView.setGravity(17);
                        textView.setPadding(0, 0, 0, C6218a.b(3.0f));
                    }
                }
            }
        } catch (Exception e10) {
            log(e10);
        }
    }

    public static void applySelectableItemBackground(View view) {
        if (view != null) {
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(new int[]{AbstractC5335a.f54978K});
            view.setBackgroundResource(obtainStyledAttributes.getResourceId(0, 0));
            obtainStyledAttributes.recycle();
        }
    }

    public static /* synthetic */ Unit b(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static boolean canAllowNewChat() {
        Cursor cursor = null;
        try {
            try {
                cursor = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE STATUS != 4 AND STATUS != 3");
                if (cursor.getCount() > 0) {
                    cursor.close();
                    return false;
                }
            } catch (Exception e10) {
                log(e10);
                if (cursor == null) {
                    return true;
                }
            }
            cursor.close();
            return true;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public static boolean canAllowOpenChatActivityInOfflineState(SalesIQChat salesIQChat) {
        if (salesIQChat == null || !(salesIQChat.getStatus() == 2 || salesIQChat.getStatus() == 4)) {
            return (!com.zoho.livechat.android.modules.brand.ui.helpers.a.J(salesIQChat != null ? salesIQChat.getConvID() : null, salesIQChat != null ? salesIQChat.getDeptid() : null, salesIQChat != null && salesIQChat.isTriggeredChat()) && C6822a.s(EnumC4544a.Online) == null && C6822a.p() == null) ? false : true;
        }
        return true;
    }

    public static boolean canConnectToWMS() {
        Cursor cursor = null;
        try {
            try {
                cursor = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE STATUS != 4 AND STATUS != 3");
                if (cursor.getCount() > 0) {
                    cursor.close();
                    return true;
                }
            } catch (Exception e10) {
                log(e10);
                if (cursor == null) {
                    return false;
                }
            }
            cursor.close();
            return false;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public static boolean canMakeDepartmentsApiRequest(long j10) {
        return j10 == 0 || (rd.b.f() - j10) / 1000 >= 10;
    }

    public static boolean canShowAdvertiseBadge() {
        Hashtable androidChannel = getAndroidChannel();
        int intValue = (androidChannel == null || !androidChannel.containsKey("license_info")) ? 0 : getInteger(((Hashtable) androidChannel.get("license_info")).get("planid")).intValue();
        return intValue == 1 || intValue == 7 || intValue == 12 || intValue == 29;
    }

    public static boolean canShowFeedback() {
        Hashtable androidChannel = getAndroidChannel();
        return (androidChannel != null ? getBoolean(((Hashtable) ((Hashtable) androidChannel.get("chat")).get(EventGroupType.FEEDBACK_EVENT_GROUP)).get(ViewProps.ENABLED)) : false) && C6218a.M().getBoolean("component_feedback", true);
    }

    public static boolean canShowInAppNotification() {
        if (C6218a.M() != null) {
            return C6218a.M().getBoolean("enableinapp", true);
        }
        return true;
    }

    public static boolean canShowLauncher() {
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel == null || !androidChannel.containsKey("show_launcher")) {
            return false;
        }
        return getBoolean(androidChannel.get("show_launcher"));
    }

    public static boolean canShowOperatorImageInChat() {
        return C6218a.M().getBoolean("component_operator_image", true);
    }

    public static boolean canShowOperatorImageInLauncher() {
        return ZohoSalesIQ.Chat.canShowOperatorImageOnBubble();
    }

    public static boolean canShowRating() {
        Hashtable androidChannel = getAndroidChannel();
        return (androidChannel != null ? getBoolean(((Hashtable) ((Hashtable) androidChannel.get("chat")).get("reaction")).get(ViewProps.ENABLED)) : false) && C6218a.M().getBoolean("component_rating", true);
    }

    public static boolean canShowScreenshotOption() {
        return C6218a.M().getBoolean("screen_shot", true);
    }

    public static String captilise(String str) {
        if (str == null || str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        sb2.setCharAt(0, Character.toUpperCase(sb2.charAt(0)));
        return sb2.toString();
    }

    public static Drawable changeDrawableColor(Context context, int i10, int i11) {
        Drawable drawable = null;
        try {
            drawable = AbstractC5338c.getDrawable(context, i10).mutate();
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
            return drawable;
        } catch (Exception e10) {
            log(e10);
            return drawable;
        }
    }

    public static boolean checkMultipleChatRestriction() {
        return isMultipleChatsDisabled() && !canAllowNewChat();
    }

    private static Calendar clearTimes(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    public static void copyFile(File file, File file2) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        try {
            try {
                fileInputStream = new FileInputStream(file.getAbsolutePath());
                try {
                    fileOutputStream = new FileOutputStream(file2);
                } catch (IOException e10) {
                    log(e10);
                }
                try {
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            } else {
                                fileOutputStream.write(bArr, 0, read);
                            }
                        }
                    } catch (IOException e11) {
                        log(e11);
                    }
                    fileInputStream.close();
                } finally {
                    fileOutputStream.close();
                }
            } catch (Throwable th2) {
                fileInputStream.close();
                throw th2;
            }
        } catch (Exception e12) {
            log(e12);
        }
    }

    public static void copyText(String str) {
        if (str != null) {
            ((ClipboardManager) MobilistenInitProvider.k().getApplicationContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("", str));
            if (Build.VERSION.SDK_INT <= 32) {
                MobilistenUtil.w(od.t.f61138x0, 0);
            }
        }
    }

    public static boolean creditCardMaskEnabled() {
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel == null || !androidChannel.containsKey("license_info")) {
            return false;
        }
        return getBoolean(((Hashtable) androidChannel.get("license_info")).get("creditmask"));
    }

    public static /* synthetic */ void d(SalesIQChat salesIQChat, String str, String str2, SalesIQChatListener salesIQChatListener, VisitorChat visitorChat, we.b bVar) {
        if (salesIQChat != null && salesIQChat.getType() == SalesIQChat.c.Call) {
            if (str.equals("QUEUE_POSITION")) {
                Ud.b.e(str2, salesIQChat.getQueuePosition());
            }
            return;
        }
        if (salesIQChatListener != null) {
            str.getClass();
            switch (str) {
                case "CHAT_EXPIRY":
                    salesIQChatListener.onChatExpired(visitorChat);
                    break;
                case "CHAT_MISSED":
                    salesIQChatListener.handleChatMissed(visitorChat);
                    break;
                case "CHAT_RATING":
                    salesIQChatListener.handleRating(visitorChat);
                    break;
                case "CHAT_REOPEN":
                    salesIQChatListener.handleChatReOpened(visitorChat);
                    break;
                case "CHAT_FEEDBACK":
                    salesIQChatListener.handleFeedback(visitorChat);
                    break;
                case "CHATVIEW_OPEN":
                    salesIQChatListener.handleChatViewOpen(str2);
                    break;
                case "CHAT_ATTENDED":
                    salesIQChatListener.handleChatAttended(visitorChat);
                    break;
                case "CHATVIEW_CLOSE":
                    salesIQChatListener.handleChatViewClose(str2);
                    break;
                case "CHAT_CLOSE":
                    salesIQChatListener.handleChatClosed(visitorChat);
                    break;
                case "CHAT_ERROR":
                    salesIQChatListener.onError(visitorChat, bVar);
                    break;
                case "CHAT_OPEN":
                    salesIQChatListener.handleChatOpened(visitorChat);
                    break;
                case "QUEUE_POSITION":
                    salesIQChatListener.handleQueuePositionChange(visitorChat);
                    break;
            }
        }
    }

    public static void deleteTriggerChat() {
        com.zoho.livechat.android.provider.a.INSTANCE.delete(MobilistenInitProvider.k().getContentResolver(), b.a.f44269a, "CHATID=?", new String[]{"trigger_temp_chid"});
        C6966g.w("trigger_temp_chid");
    }

    public static /* synthetic */ void e(EditText editText, Dialog dialog, View view) {
        hideKeyboard(editText);
        dialog.dismiss();
    }

    public static boolean enableChatInOfflineMode() {
        if (getEmbedStatus()) {
            return true;
        }
        return Q.g();
    }

    public static void endChat(String str) {
        SalesIQChat chatWithAnyId = getChatWithAnyId(str);
        if (chatWithAnyId == null || chatWithAnyId.getVisitorid() == null) {
            return;
        }
        Uf.j.L();
        if (chatWithAnyId.getStatus() == 2) {
            new pd.e().b(chatWithAnyId.getVisitorid());
            return;
        }
        pd.n nVar = new pd.n(chatWithAnyId.getVisitorid(), false);
        if (qd.c.k()) {
            nVar.c();
        } else {
            rd.b.m(nVar);
        }
    }

    public static /* synthetic */ void f(String str, SalesIQListener salesIQListener, String str2, od.x xVar) {
        str.getClass();
        switch (str) {
            case "CUSTOM_LAUNCHER_VISIBILITY":
                salesIQListener.handleCustomLauncherVisibility(getBoolean(str2));
                break;
            case "SUPPORT_CLOSE":
                salesIQListener.handleSupportClose();
                break;
            case "IP_BLOCK":
                salesIQListener.handleIPBlock();
                break;
            case "BOT_TRIGGER":
                salesIQListener.handleBotTrigger();
                break;
            case "TRIGGER":
                salesIQListener.handleTrigger(str2, xVar);
                break;
            case "OPERATOR_OFFLINE":
                salesIQListener.handleOperatorsOffline();
                break;
            case "REGISTRATION_FAILED":
                log("MobilistenEncryptedSharedPreferences- visitor registration failed event triggered");
                Bd.b onVisitorRegistrationFailed = salesIQListener.onVisitorRegistrationFailed(new d.b(513, "Encrypted shared preferences or master key creation failed or the file may have been corrupted. Please return the visitor data."));
                if (onVisitorRegistrationFailed != null) {
                    if (!(onVisitorRegistrationFailed instanceof SalesIQUser)) {
                        if (onVisitorRegistrationFailed instanceof SalesIQGuestUser) {
                            log("MobilistenEncryptedSharedPreferences- Guest user acknowledged");
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("avuid", getAVUID());
                            } catch (Exception e10) {
                                log(e10);
                            }
                            ne.l.f(new b.n(jSONObject.toString()));
                            if (!Yd.a.o().contains("are_new_encrypted_keys_present_in_default_preferences") || !Yd.a.o().getBoolean("are_new_encrypted_keys_present_in_default_preferences", true)) {
                                Yd.a.o().edit().remove("is_encrypted_shared_preference_failure_acknowledged").commit();
                                break;
                            } else {
                                Ye.d.o(De.a.IsEncryptedSharedPreferenceFailureAcknowledged, true).b(true);
                                break;
                            }
                        }
                    } else {
                        log("MobilistenEncryptedSharedPreferences- re-registering visitor");
                        registerVisitor(((SalesIQUser) onVisitorRegistrationFailed).getUniqueVisitorId(), new b(onVisitorRegistrationFailed));
                        break;
                    }
                }
                break;
            case "SUPPORT_OPEN":
                salesIQListener.handleSupportOpen();
                break;
            case "OPERATOR_ONLINE":
                salesIQListener.handleOperatorsOnline();
                break;
        }
    }

    public static void fetchAttenderImage(String str, Boolean bool, OperatorImageListener operatorImageListener) {
        Drawable[] drawableArr = {null};
        boolean isBotSender = isBotSender(str);
        if (bool.booleanValue()) {
            if (isBotSender) {
                drawableArr[0] = MobilistenInitProvider.k().getResources().getDrawable(od.p.f60143o3);
            } else {
                drawableArr[0] = MobilistenInitProvider.k().getResources().getDrawable(od.p.f60127l2);
            }
        }
        if (str == null || str.length() == 0 || C6822a.m() == null || C6822a.m().getChat() == null || C6822a.m().getChat().getShowOperatorImage() != Boolean.TRUE) {
            operatorImageListener.onSuccess(drawableArr[0]);
            return;
        }
        if (!isValidAttenderID(str)) {
            operatorImageListener.onFailure(606, "invalid attender id");
        } else if (ZohoLiveChat.getApplicationManager() != null) {
            ZohoLiveChat.getApplicationManager();
            wd.d.u(Uf.j.n(), sd.d.b(str, false), new a(bool, operatorImageListener, drawableArr), true);
        }
    }

    public static String getAVUID() {
        if (C6218a.M() != null) {
            return C6218a.M().getString("avuid", null);
        }
        return null;
    }

    public static ArrayList<SalesIQChat> getAllChats(SalesIQChat.c cVar) {
        String[] strArr;
        ArrayList<SalesIQChat> arrayList = new ArrayList<>();
        Cursor cursor = null;
        try {
            String str = "SELECT * FROM SIQ_CONVERSATIONS";
            if (cVar != null) {
                try {
                    str = "SELECT * FROM SIQ_CONVERSATIONS WHERE TYPE = ?";
                    if (cVar == SalesIQChat.c.Call) {
                        str = str + " OR MEDIA IS NOT NULL";
                    }
                    strArr = new String[]{cVar.value};
                } catch (Exception e10) {
                    log(e10);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayList;
                }
            } else {
                strArr = null;
            }
            cursor = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery(str + " ORDER BY LMTIME DESC", strArr);
            if (cursor.moveToFirst()) {
                while (!cursor.isAfterLast()) {
                    arrayList.add(getChat(cursor.getString(cursor.getColumnIndex("CHATID"))));
                    cursor.moveToNext();
                }
            }
            cursor.close();
            return arrayList;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public static ArrayList<String> getAllOpenChatIds() {
        return getAllOpenChatIds(null);
    }

    public static Hashtable getAndroidChannel() {
        String string;
        if (C6218a.M() != null && (string = C6218a.M().getString("android_channel", null)) != null) {
            try {
                return (Hashtable) AbstractC6574b.d(string);
            } catch (Exception e10) {
                log(e10);
            }
        }
        return null;
    }

    public static String getAnnonID() {
        if (Q.f44445D == null && C6218a.M() != null) {
            Q.f44445D = C6218a.M().getString("annonid", null);
        }
        return Q.f44445D;
    }

    public static String getAppID() {
        if (C6218a.M() != null) {
            return C6218a.M().getString(PublisherMetadata.APP_ID, null);
        }
        return null;
    }

    private static VisitorChat.Media getAsVisitorMedia(SalesIQChat.Media media) {
        if (media == null) {
            return null;
        }
        return new VisitorChat.Media(media.f42491id, media.endTime, getVisitorUserType(media.initiatedBy), media.pickupTime, media.connectedTime, getVisitorMediaStatus(media), getVisitorUserType(media.initiatedBy), media.type, media.createdTime);
    }

    public static boolean getBoolean(Object obj) {
        try {
            return Boolean.parseBoolean(obj + "");
        } catch (Exception e10) {
            log(e10);
            return false;
        }
    }

    public static String getCVUID() {
        return Ye.d.k(De.a.CVUID);
    }

    public static SalesIQChat getCall(String str) {
        if (str != null) {
            try {
                Cursor executeRawQuery = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE CHATID = ? AND (TYPE = '" + SalesIQChat.c.Call.value + "' OR MEDIA IS NOT NULL)", new String[]{str});
                try {
                    SalesIQChat salesIQChat = executeRawQuery.moveToFirst() ? new SalesIQChat(executeRawQuery) : null;
                    executeRawQuery.close();
                    return salesIQChat;
                } finally {
                }
            } catch (Exception e10) {
                log(e10);
            }
        }
        return null;
    }

    public static SalesIQChat getChat(String str) {
        if (str != null) {
            try {
                Cursor executeRawQuery = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE CHATID = ?", new String[]{str});
                try {
                    SalesIQChat salesIQChat = executeRawQuery.moveToFirst() ? new SalesIQChat(executeRawQuery) : null;
                    executeRawQuery.close();
                    return salesIQChat;
                } finally {
                }
            } catch (Exception e10) {
                log(e10);
            }
        }
        return null;
    }

    public static int getChatConsentConfig() {
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel != null && isGlobalGDPREnabled() && androidChannel.containsKey("notify_terms") && getBoolean(androidChannel.get("privacy"))) {
            return getInteger(((Hashtable) androidChannel.get("notify_terms")).get(EventKeys.ERROR_CODE)).intValue();
        }
        return 0;
    }

    public static String getChatConsentContent() {
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel == null || !androidChannel.containsKey("notify_terms")) {
            return null;
        }
        return getString(((Hashtable) androidChannel.get("notify_terms")).get("banner_content"));
    }

    public static String getChatConsentNegativeButttonContent() {
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel == null || !androidChannel.containsKey("notify_terms")) {
            return null;
        }
        return getString(((Hashtable) androidChannel.get("notify_terms")).get("banner_content"));
    }

    public static String getChatConsentPolicyUrl() {
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel != null && isGlobalGDPREnabled() && androidChannel.containsKey("notify_terms") && getBoolean(androidChannel.get("privacy"))) {
            return getString(((Hashtable) androidChannel.get("notify_terms")).get(EventKeys.URL));
        }
        return null;
    }

    public static String getChatConsentPositiveButtonContent() {
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel == null || !androidChannel.containsKey("notify_terms")) {
            return null;
        }
        return getString(((Hashtable) androidChannel.get("notify_terms")).get("banner_content"));
    }

    public static SalesIQChat getChatFromConvID(String str) {
        if (str != null) {
            try {
                Cursor executeRawQuery = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE CONVID = ?", new String[]{str});
                try {
                    SalesIQChat salesIQChat = executeRawQuery.moveToFirst() ? new SalesIQChat(executeRawQuery) : null;
                    executeRawQuery.close();
                    return salesIQChat;
                } finally {
                }
            } catch (Exception e10) {
                log(e10);
            }
        }
        return null;
    }

    public static long getChatWaitingTime() {
        if (Te.a.p0() != null) {
            return Te.a.p0().longValue();
        }
        if (C6218a.M() != null) {
            return C6218a.M().getLong("waitingTime", 0L);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SalesIQChat getChatWithAnyId(String str) {
        Throwable th2;
        Cursor cursor;
        if (str != null && !str.isEmpty()) {
            try {
                cursor = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE (CONVID = ? OR CHATID = ? OR VISITID = ? OR VISITORID = ?)", new String[]{str, str, str, str});
                try {
                    try {
                        SalesIQChat chat = cursor.moveToFirst() ? getChat(cursor.getString(cursor.getColumnIndex("CHATID"))) : null;
                        cursor.close();
                        return chat;
                    } catch (Exception e10) {
                        e = e10;
                        log(e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th2;
                }
            } catch (Exception e11) {
                e = e11;
                cursor = null;
            } catch (Throwable th4) {
                th2 = th4;
                cursor = null;
                if (cursor != null) {
                }
                throw th2;
            }
        }
        return null;
    }

    public static String getChatid(String str) {
        String str2 = null;
        try {
            Cursor executeRawQuery = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE RCHATID = ?", new String[]{str});
            try {
                if (executeRawQuery.moveToFirst()) {
                    str2 = executeRawQuery.getString(executeRawQuery.getColumnIndex("CHATID"));
                }
                executeRawQuery.close();
                return str2;
            } finally {
            }
        } catch (Exception e10) {
            log(e10);
            return str2;
        }
    }

    public static String getChatidfromVisitID(String str) {
        String str2 = null;
        try {
            Cursor executeRawQuery = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE VISITID = ?", new String[]{str});
            try {
                if (executeRawQuery.moveToFirst()) {
                    str2 = executeRawQuery.getString(executeRawQuery.getColumnIndex("CHATID"));
                }
                executeRawQuery.close();
                return str2;
            } finally {
            }
        } catch (Exception e10) {
            log(e10);
            return str2;
        }
    }

    public static String getChatidfromVisitorID(@NonNull String str) {
        String str2 = null;
        try {
            Cursor executeRawQuery = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE VISITORID = ?", new String[]{str});
            try {
                if (executeRawQuery.moveToFirst()) {
                    str2 = executeRawQuery.getString(executeRawQuery.getColumnIndex("CHATID"));
                }
                executeRawQuery.close();
                return str2;
            } finally {
            }
        } catch (Exception e10) {
            log(e10);
            return str2;
        }
    }

    public static ArrayList<SalesIQChat> getChatsWithSpecificStatus(@NonNull EnumC6361a enumC6361a, @NonNull SalesIQChat.c cVar) {
        String[] strArr;
        ArrayList<SalesIQChat> arrayList = new ArrayList<>();
        Cursor cursor = null;
        try {
            try {
                String str = "SELECT * FROM SIQ_CONVERSATIONS WHERE STATUS = ?";
                switch (c.$SwitchMap$com$zoho$livechat$android$constants$ConversationType[enumC6361a.ordinal()]) {
                    case 1:
                        strArr = new String[]{String.valueOf(2)};
                        break;
                    case 2:
                        strArr = new String[]{String.valueOf(1)};
                        break;
                    case 3:
                        str = "SELECT * FROM SIQ_CONVERSATIONS WHERE STATUS = ? OR STATUS = ? OR STATUS = ? OR STATUS = ? OR STATUS = ?";
                        strArr = new String[]{String.valueOf(2), String.valueOf(1), String.valueOf(7), String.valueOf(6), String.valueOf(5)};
                        break;
                    case 4:
                        strArr = new String[]{String.valueOf(4)};
                        break;
                    case 5:
                        strArr = new String[]{String.valueOf(3)};
                        break;
                    case 6:
                        str = "SELECT * FROM SIQ_CONVERSATIONS WHERE STATUS = ? OR STATUS = ? ";
                        strArr = new String[]{String.valueOf(4), String.valueOf(3)};
                        break;
                    default:
                        strArr = null;
                        break;
                }
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
                strArr2[strArr2.length - 1] = cVar.value;
                cursor = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery((str + " AND TYPE = ?") + " ORDER BY LMTIME DESC", strArr2);
                if (cursor.moveToFirst()) {
                    while (!cursor.isAfterLast()) {
                        arrayList.add(getChat(cursor.getString(cursor.getColumnIndex("CHATID"))));
                        cursor.moveToNext();
                    }
                }
                cursor.close();
                return arrayList;
            } catch (Exception e10) {
                log(e10);
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public static HttpURLConnection getCommonHeaders(HttpURLConnection httpURLConnection) {
        return getCommonHeaders(httpURLConnection, true);
    }

    public static String getCompanyName() {
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel != null) {
            return getString(androidChannel.get("company_name"));
        }
        return null;
    }

    public static ArrayList<String> getConnectedChatIds() {
        return getConnectedChatIds(null);
    }

    public static String getConversationTitle() {
        if (C6218a.M() != null) {
            return C6218a.M().getString("conversation_title", null);
        }
        return null;
    }

    public static ArrayList<SalesIQChat> getConversations() {
        return getConversations(null, null);
    }

    private static String getCreditCardNumberMaskedString(String str) {
        String str2;
        switch (str.length()) {
            case 13:
                str2 = "XXX-XXX-XXX-";
                break;
            case 14:
                str2 = "XXX-XXX-XXXX-";
                break;
            case 15:
                str2 = "XXX-XXXX-XXXX-";
                break;
            case 16:
                str2 = "XXXX-XXXX-XXXX-";
                break;
            default:
                str2 = null;
                break;
        }
        if (str2 == null) {
            return str;
        }
        return str2 + str.substring(str.length() - 4, str.length());
    }

    public static String getCurrentChatID() {
        return currentChatId;
    }

    public static String getCustomArticleTitle() {
        Hashtable androidChannel;
        Hashtable hashtable;
        Hashtable hashtable2;
        Hashtable hashtable3;
        if (ZohoLiveChat.getApplicationManager() == null || (androidChannel = getAndroidChannel()) == null || (hashtable = (Hashtable) androidChannel.get("resources")) == null || (hashtable2 = (Hashtable) hashtable.get("article")) == null || (hashtable3 = (Hashtable) hashtable2.get("custom_title")) == null) {
            return null;
        }
        String string = getString(hashtable3.get(Locale.getDefault().getLanguage()));
        if (string.trim().length() > 0) {
            return string;
        }
        return null;
    }

    public static String getDateDifference(Context context, Long l10) {
        Calendar clearTimes = clearTimes(Calendar.getInstance());
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, -1);
        return l10.longValue() > clearTimes.getTimeInMillis() ? context.getResources().getString(od.t.f60899M) : l10.longValue() > clearTimes(calendar).getTimeInMillis() ? context.getResources().getString(od.t.f60905N) : getFormattedDate(l10);
    }

    public static Locale getDefaultSystemLocale() {
        LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
        return locales.isEmpty() ? Resources.getSystem().getConfiguration().locale : locales.get(0);
    }

    public static double getDouble(Object obj) {
        if (obj == null) {
            return 0.0d;
        }
        try {
            return Double.parseDouble(obj + "");
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public static boolean getEmbedStatus() {
        if (C6218a.M() != null) {
            return C6218a.M().getBoolean("embedstatus", false);
        }
        return false;
    }

    public static String getFCMId() {
        return Ye.d.k(De.a.FcmToken);
    }

    public static String getFeedbackHeading(SalesIQChat salesIQChat, Context context, int i10) {
        String str;
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel != null) {
            Hashtable hashtable = (Hashtable) ((Hashtable) androidChannel.get("chat")).get("labels");
            str = getString(hashtable.get("feedback_and_rating"));
            if (i10 == 1) {
                str = getString(hashtable.get(EventGroupType.FEEDBACK_EVENT_GROUP));
            } else if (i10 == 2) {
                str = getString(hashtable.get("rating"));
            }
            if (str != null && str.trim().length() > 0 && salesIQChat != null) {
                str = Vf.a.a(salesIQChat, str);
            }
        } else {
            str = null;
        }
        return (str == null || str.trim().length() == 0) ? context.getString(od.t.f60941T) : str;
    }

    public static String getFeedbackResponse(SalesIQChat salesIQChat, Context context) {
        String str;
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel != null) {
            str = getString(((Hashtable) ((Hashtable) androidChannel.get("chat")).get(EventGroupType.FEEDBACK_EVENT_GROUP)).get("message"));
            if (str != null && str.trim().length() > 0 && salesIQChat != null) {
                str = Vf.a.a(salesIQChat, str);
            }
        } else {
            str = null;
        }
        return (str == null || str.trim().length() == 0) ? context.getString(od.t.f60935S) : str;
    }

    public static String getFormattedDate(Long l10) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
        int i10 = simpleDateFormat.getCalendar().get(1);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy");
        simpleDateFormat2.format(l10);
        return (i10 == simpleDateFormat2.getCalendar().get(1) ? new SimpleDateFormat("MMM dd") : new SimpleDateFormat("dd MMM yyyy")).format(l10);
    }

    public static int getGoogleTranslateConsentConfig() {
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel != null && isGlobalGDPREnabled() && androidChannel.containsKey("notify_googletranslator_usage")) {
            return getInteger(((Hashtable) androidChannel.get("notify_googletranslator_usage")).get(EventKeys.ERROR_CODE)).intValue();
        }
        return 0;
    }

    public static String getGoogleTranslateConsentPolicyUrl() {
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel == null || !androidChannel.containsKey("notify_googletranslator_usage")) {
            return null;
        }
        return getString(((Hashtable) androidChannel.get("notify_googletranslator_usage")).get(EventKeys.URL));
    }

    public static String getInsID() {
        if (C6218a.M() != null) {
            return C6218a.M().getString("insid", null);
        }
        return null;
    }

    public static Integer getInteger(Object obj) {
        if (obj != null) {
            try {
                return Integer.valueOf(Integer.parseInt(obj + ""));
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static String getLSID() {
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel == null || !androidChannel.containsKey("lsid")) {
            return null;
        }
        return (String) androidChannel.get("lsid");
    }

    @NonNull
    public static String getLanguage() {
        String languageOrNull = getLanguageOrNull();
        if (languageOrNull != null) {
            return languageOrNull;
        }
        Locale defaultSystemLocale = getDefaultSystemLocale();
        return defaultSystemLocale != null ? defaultSystemLocale.getLanguage() : "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (com.facebook.hermes.intl.Constants.COLLATION_DEFAULT.equalsIgnoreCase(r0) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getLanguageOrNull() {
        String string;
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel != null || !Uf.j.f12224n) {
            string = Uf.j.f12224n ? getString(androidChannel.get("language")) : C6218a.M().getString("mobilisten_locale", Locale.getDefault().getLanguage());
            if (string.trim().length() > 0) {
            }
        }
        string = null;
        return (ZohoSalesIQ.Chat.getLanguage() == null || ZohoSalesIQ.Chat.getLanguage().trim().length() <= 0) ? string : ZohoSalesIQ.Chat.getLanguage();
    }

    public static VisitorChat.a getLastSalesIQMessage(Message message) {
        Spannable a10;
        VisitorChat.a.b bVar;
        VisitorChat.a aVar = new VisitorChat.a();
        if (message != null) {
            Message.g messageType = message.getMessageType();
            Message.g gVar = Message.g.InfoMessage;
            if (messageType != gVar) {
                aVar.i(getSenderId(message.getSender()));
                aVar.h(Vf.b.i().a(message.getDisplayName()).toString());
            }
            aVar.m(Long.valueOf(message.getServerTime() > 0 ? message.getServerTime() : message.getClientTime()));
            boolean z10 = false;
            if (Message.g.isVisitorMessageType(message.getMessageType())) {
                if (message.getSender() != null && message.getSender().startsWith("$")) {
                    z10 = true;
                }
                aVar.j(z10);
            } else {
                aVar.j(false);
            }
            aVar.g(Boolean.TRUE.equals(message.isRead()));
            if (message.getSender() != null && message.getSender().equals(getAnnonID()) && message.getMessageType() != gVar) {
                switch (c.$SwitchMap$com$zoho$livechat$android$modules$messages$domain$entities$Message$Status[message.getStatus().ordinal()]) {
                    case 1:
                    case 2:
                        bVar = VisitorChat.a.b.Sending;
                        break;
                    case 3:
                        bVar = VisitorChat.a.b.Uploading;
                        break;
                    case 4:
                        bVar = VisitorChat.a.b.Sent;
                        break;
                    case 5:
                    case 6:
                        bVar = VisitorChat.a.b.Failure;
                        break;
                    default:
                        bVar = null;
                        break;
                }
                aVar.k(bVar);
            }
            String f10 = AbstractC5896h.f(Yd.a.j().B(message.getMessageType()));
            if (f10.equals(Message.g.ReopenQuestion.getStringValue())) {
                f10 = Message.g.Text.getStringValue();
            }
            aVar.n(f10);
            aVar.l(getString(Vf.b.i().c(unescapeHtml(message.getContent()))));
            Message.Attachment attachment = message.getAttachment();
            if (attachment != null && (og.i.f(attachment.getFileName()) || og.i.f(attachment.getType()) || og.i.f(message.getComment()))) {
                VisitorChat.a.C0607a c0607a = new VisitorChat.a.C0607a();
                c0607a.f(message.getAttachment().getType());
                c0607a.e(message.getComment());
                c0607a.g(message.getAttachment().getFileName());
                c0607a.h(Long.valueOf(message.getAttachment().getSize()));
                aVar.f(c0607a);
                return aVar;
            }
            if (message.getMessageType() == Message.g.RequestLog) {
                aVar.l(MobilistenInitProvider.k().getString(od.t.f61085o3));
                return aVar;
            }
            if (message.getMessageType() == gVar && message.getInfoMessage() != null && ZohoLiveChat.getApplicationManager() != null && (a10 = C6966g.C6967a.a(MobilistenInitProvider.k(), null, message)) != null) {
                aVar.l(a10.toString());
            }
        }
        return aVar;
    }

    public static long getLong(Object obj) {
        if (obj == null) {
            return 0L;
        }
        try {
            return Long.parseLong(obj + "");
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static String getMaskedMessage(String str) {
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = Pattern.compile("(^|\\s)([0-9]{13,16})(\\s|$)").matcher(str);
            int i10 = 0;
            while (matcher.find(i10)) {
                String trim = matcher.group().trim();
                int start = matcher.start(2);
                if (!TextUtils.isEmpty(trim) && isCreditCardNumber(trim)) {
                    return str.replaceAll(trim, getCreditCardNumberMaskedString(trim));
                }
                i10 = start;
            }
        }
        return str;
    }

    public static String getMobilistenVersionName() {
        return "8.3.7";
    }

    public static int getNotificationIcon() {
        if (C6218a.M() != null) {
            return C6218a.M().getInt("ic_launcher", 0);
        }
        return 0;
    }

    public static String getOfflineMessage(@NonNull Context context) {
        return context.getString(od.t.f60936S0);
    }

    @NonNull
    public static String getOnGoingChatId() {
        ArrayList<String> allOpenChatIds = getAllOpenChatIds(SalesIQChat.c.Chat);
        return allOpenChatIds.size() == 1 ? allOpenChatIds.get(0) : "temp_chid";
    }

    public static ArrayList<String> getOpenChatIds() {
        return getOpenChatIds(null);
    }

    public static String getPlatformName() {
        String str;
        str = "Android";
        if (C6218a.M() != null) {
            SharedPreferences M10 = C6218a.M();
            if (M10.contains("PLATFORM_NAME")) {
                return M10.getString("PLATFORM_NAME", "Android");
            }
            String str2 = platformName;
            str = str2 != null ? str2 : "Android";
            M10.edit().putString("PLATFORM_NAME", str).apply();
        }
        return str;
    }

    public static String getPostDataString(HashMap<String, String> hashMap) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append("&");
            }
            sb2.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            sb2.append("=");
            sb2.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getRatingResponse(Context context, int i10) {
        String str;
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel != null) {
            Hashtable hashtable = (Hashtable) ((Hashtable) androidChannel.get("chat")).get("reaction");
            if (i10 == 1) {
                str = getString(hashtable.get("sad"));
            } else if (i10 == 2) {
                str = getString(hashtable.get("neutral"));
            } else if (i10 == 3) {
                str = getString(hashtable.get("happy"));
            }
            if (str != null || str.trim().length() == 0) {
                if (i10 != 1) {
                    return context.getString(od.t.f60929R);
                }
                if (i10 == 2) {
                    return context.getString(od.t.f60923Q);
                }
                if (i10 == 3) {
                    return context.getString(od.t.f60917P);
                }
            }
            return str;
        }
        str = null;
        if (str != null) {
        }
        if (i10 != 1) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SalesIQChat getRecentChat() {
        Cursor cursor;
        Cursor cursor2 = null;
        r2 = null;
        SalesIQChat salesIQChat = null;
        String string = C6218a.M().getString("activechat_pkid", null);
        if (string != null) {
            String str = "SELECT * FROM SIQ_CONVERSATIONS WHERE _id = '" + string + "'";
            try {
                try {
                    cursor = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery(str);
                    try {
                        if (cursor.moveToFirst() && cursor.getInt(cursor.getColumnIndexOrThrow("STATUS")) != 4) {
                            salesIQChat = new SalesIQChat(cursor);
                        }
                        cursor.close();
                        return salesIQChat;
                    } catch (Exception e10) {
                        e = e10;
                        log(e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = str;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                cursor = null;
            } catch (Throwable th3) {
                th = th3;
                if (cursor2 != null) {
                }
                throw th;
            }
        }
        return null;
    }

    public static String getSID() {
        if (C6218a.M() != null) {
            return C6218a.M().getString("sid", null);
        }
        return null;
    }

    public static String getScreenName() {
        if (C6218a.M() != null) {
            return C6218a.M().getString("screenname", null);
        }
        return null;
    }

    private static String getSenderId(String str) {
        if (str == null) {
            return str;
        }
        try {
            if (str.startsWith("$")) {
                return str.substring(1);
            }
            if (!str.startsWith("LD")) {
                return str;
            }
            String[] split = str.split("_");
            return split[split.length - 1];
        } catch (Exception unused) {
            return str;
        }
    }

    public static String getString(Object obj) {
        if (obj == null) {
            return "";
        }
        return obj + "";
    }

    public static String getThankingResponse(SalesIQChat salesIQChat, Context context) {
        String str;
        try {
            Hashtable androidChannel = getAndroidChannel();
            if (androidChannel != null) {
                str = unescapeHtml(getString(((Hashtable) androidChannel.get("chat")).get("thanking_message")));
                if (str != null && str.trim().length() > 0 && salesIQChat != null) {
                    str = Vf.a.a(salesIQChat, str);
                }
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                return str;
            }
            return context.getString(od.t.f60911O);
        } catch (Exception unused) {
            return context.getString(od.t.f60911O);
        }
    }

    public static int getTimeRemaining(Long l10, int i10) {
        if (l10.longValue() > 0) {
            return i10 - ((int) ((rd.b.f() - l10.longValue()) / 1000));
        }
        return 0;
    }

    public static Hashtable getTrackingButtonContent() {
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel == null || !androidChannel.containsKey("notify_cookies")) {
            return null;
        }
        return (Hashtable) ((Hashtable) androidChannel.get("notify_cookies")).get("button_text");
    }

    public static int getTrackingConsentConfig() {
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel != null && isGlobalGDPREnabled() && androidChannel.containsKey("notify_cookies") && getBoolean(androidChannel.get("privacy"))) {
            return getInteger(((Hashtable) androidChannel.get("notify_cookies")).get(EventKeys.ERROR_CODE)).intValue();
        }
        return 0;
    }

    public static String getTrackingConsentContent() {
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel == null || !androidChannel.containsKey("notify_cookies")) {
            return null;
        }
        return getString(((Hashtable) androidChannel.get("notify_cookies")).get("banner_content"));
    }

    public static String getTrackingConsentPolicyUrl() {
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel == null || !androidChannel.containsKey("notify_cookies")) {
            return null;
        }
        return getString(((Hashtable) androidChannel.get("notify_cookies")).get("link_url"));
    }

    public static String getTrackingConsentPolicyUrlContent() {
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel == null || !androidChannel.containsKey("notify_cookies")) {
            return null;
        }
        return getString(((Hashtable) androidChannel.get("notify_cookies")).get("link_content"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getTriggerOpenChatId() {
        Cursor cursor;
        Throwable th2;
        try {
            cursor = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE STATUS == 5 ORDER BY LMTIME DESC");
            try {
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndex("CHATID"));
                        cursor.close();
                        return string;
                    }
                } catch (Exception e10) {
                    e = e10;
                    log(e);
                }
            } catch (Throwable th3) {
                th2 = th3;
                if (cursor != null) {
                    cursor.close();
                }
                throw th2;
            }
        } catch (Exception e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th4) {
            cursor = null;
            th2 = th4;
            if (cursor != null) {
            }
            throw th2;
        }
        cursor.close();
        return null;
    }

    public static int getVersion() {
        return 391;
    }

    @NonNull
    public static VisitorChat getVisitorChatObject(@NonNull SalesIQChat salesIQChat) {
        VisitorChat visitorChat = new VisitorChat();
        if (salesIQChat.getVisitid() != null) {
            visitorChat.q(salesIQChat.getVisitid());
        } else {
            visitorChat.q(salesIQChat.getConvID());
        }
        visitorChat.s(salesIQChat.getConvID());
        visitorChat.y(salesIQChat.getQuestion());
        visitorChat.o(salesIQChat.getAttenderid());
        if (salesIQChat.getAttenderName() != null) {
            visitorChat.p(getString(Vf.b.i().c(unescapeHtml(salesIQChat.getAttenderName()))));
        }
        visitorChat.n(salesIQChat.getAttenderEmail());
        if (salesIQChat.getDepartmentName() != null) {
            visitorChat.t(getString(Vf.b.i().c(unescapeHtml(salesIQChat.getDepartmentName()))));
        }
        visitorChat.v(salesIQChat.isBotAttender());
        visitorChat.r(salesIQChat.getStatus());
        visitorChat.u(salesIQChat.getFeedback());
        visitorChat.A(salesIQChat.getRating());
        visitorChat.B(salesIQChat.getUnreadCount());
        visitorChat.z(salesIQChat.getQueuePosition() > 0 ? salesIQChat.getQueuePosition() : -1);
        visitorChat.w(getLastSalesIQMessage(salesIQChat.getLastMessage()));
        visitorChat.x(getAsVisitorMedia(salesIQChat.getMedia()));
        return visitorChat;
    }

    public static ArrayList<VisitorChat> getVisitorChats(List<SalesIQChat> list) {
        ArrayList<VisitorChat> arrayList = new ArrayList<>();
        Iterator<SalesIQChat> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(getVisitorChatObject(it.next()));
        }
        return arrayList;
    }

    private static VisitorChat.Media.Status getVisitorMediaStatus(@NonNull SalesIQChat.Media media) {
        SalesIQChat.Media.Status status = media.status;
        if (status == SalesIQChat.Media.Status.CANCELLED) {
            return VisitorChat.Media.Status.CANCELLED;
        }
        if (status == SalesIQChat.Media.Status.ENDED) {
            return VisitorChat.Media.Status.ENDED;
        }
        if (status == SalesIQChat.Media.Status.MISSED) {
            return VisitorChat.Media.Status.MISSED;
        }
        if (status == SalesIQChat.Media.Status.REJECTED) {
            return VisitorChat.Media.Status.REJECTED;
        }
        return null;
    }

    public static String getVisitorName() {
        return getVisitorName(true);
    }

    private static VisitorChat.Media.UserType getVisitorUserType(SalesIQChat.Media.UserType userType) {
        if (userType == SalesIQChat.Media.UserType.VISITOR) {
            return VisitorChat.Media.UserType.VISITOR;
        }
        if (userType == SalesIQChat.Media.UserType.OPERATOR) {
            return VisitorChat.Media.UserType.AGENT;
        }
        return null;
    }

    public static String getWmsChatid(String str) {
        String str2 = null;
        try {
            Cursor executeRawQuery = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE CHATID = ?", new String[]{str});
            try {
                if (executeRawQuery.moveToFirst()) {
                    str2 = executeRawQuery.getString(executeRawQuery.getColumnIndex("RCHATID"));
                }
                executeRawQuery.close();
                return str2;
            } finally {
            }
        } catch (Exception e10) {
            log(e10);
            return str2;
        }
    }

    public static String getZLDP() {
        if (C6218a.M() != null) {
            return C6218a.M().getString("zldp", null);
        }
        return null;
    }

    public static String getZLDT() {
        if (C6218a.M() != null) {
            return C6218a.M().getString("zldt", null);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getremainingtime(String str) {
        long j10;
        int i10;
        Cursor cursor = null;
        try {
            try {
                cursor = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE CHATID = ?", new String[]{str});
                if (cursor.moveToFirst()) {
                    j10 = cursor.getLong(cursor.getColumnIndex("TIMER_START_TIME"));
                    try {
                        i10 = getInteger(cursor.getString(cursor.getColumnIndex("TIMER_END_TIME"))).intValue();
                    } catch (Exception e10) {
                        e = e10;
                        log(e);
                        i10 = 0;
                        if (j10 <= 0) {
                        }
                    }
                } else {
                    i10 = 0;
                    j10 = 0;
                }
                cursor.close();
            } finally {
                if (0 != 0) {
                    cursor.close();
                }
            }
        } catch (Exception e11) {
            e = e11;
            j10 = 0;
        }
        if (j10 <= 0) {
            return i10 - ((int) ((rd.b.f() - j10) / 1000));
        }
        return 0;
    }

    public static void handleUri(Context context, String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        Uri parse = Uri.parse(str);
        SalesIQChat chat = getChat(getCurrentChatID());
        if (str.startsWith("tel:") || str.startsWith("mailto:") || ZohoSalesIQ.Chat.getListener() == null || ZohoSalesIQ.Chat.getListener().handleUri(parse, getVisitorChatObject(chat))) {
            openUri(context, parse);
        }
    }

    public static boolean hasCreditCardNumberOccurence(String str) {
        int i10 = 0;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Matcher matcher = Pattern.compile("(^|\\s)[0-9]{13,16}(\\s|$)").matcher(str);
        boolean z10 = false;
        while (matcher.find(i10)) {
            String trim = matcher.group().trim();
            int start = matcher.start(2);
            if (!TextUtils.isEmpty(trim) && (z10 = isCreditCardNumber(trim))) {
                return z10;
            }
            i10 = start;
        }
        return z10;
    }

    public static void hideKeyboard(View view) {
        InputMethodManager inputMethodManager;
        if (view == null || (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static boolean isActivityLive(Activity activity) {
        return !activity.isDestroyed();
    }

    public static boolean isAnnonVisitorbyName(String str) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    String[] split = str.split(" ");
                    if (split.length == 2 && "Visitor".equals(split[0])) {
                        if (isNumeric(split[1])) {
                            return true;
                        }
                    }
                    return false;
                }
            } catch (Exception e10) {
                log(e10);
            }
        }
        return false;
    }

    public static boolean isAnyChatsNeedToBeCompleted() {
        try {
            Cursor executeRawQuery = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE STATUS != 3 AND STATUS != 4");
            try {
                boolean z10 = executeRawQuery.getCount() > 0;
                executeRawQuery.close();
                return z10;
            } finally {
            }
        } catch (Exception e10) {
            log(e10);
            return false;
        }
    }

    public static boolean isAppEnabled() {
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel != null) {
            return getBoolean(androidChannel.get("is_enabled"));
        }
        return false;
    }

    public static boolean isArticlesEnabled() {
        return isArticlesEnabledFromSalesIQ() && C6218a.M().getBoolean("enablearticles", true);
    }

    public static boolean isArticlesEnabledFromSalesIQ() {
        boolean z10;
        boolean z11;
        boolean z12;
        Hashtable hashtable;
        Hashtable hashtable2;
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel != null) {
            z11 = androidChannel.containsKey("license_info") ? getBoolean(((Hashtable) androidChannel.get("license_info")).get("faqallowed")) : false;
            z12 = z11 ? isConfigurationEnabled(androidChannel, "faq") : false;
            z10 = (!z12 || (hashtable = (Hashtable) androidChannel.get("resources")) == null || (hashtable2 = (Hashtable) hashtable.get("article")) == null) ? false : getBoolean(hashtable2.get(ViewProps.ENABLED));
        } else {
            z10 = false;
            z11 = false;
            z12 = false;
        }
        return z11 && z12 && z10;
    }

    public static boolean isBotSender(String str) {
        try {
            return str.contains("_") ? com.google.crypto.tink.integration.android.b.f37029b.equalsIgnoreCase(String.valueOf(str.split("_")[2].charAt(0))) : str.startsWith(com.google.crypto.tink.integration.android.b.f37029b);
        } catch (Exception e10) {
            log(e10);
            return false;
        }
    }

    public static boolean isChatEnabled() {
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel == null) {
            return false;
        }
        boolean isConfigurationEnabled = isConfigurationEnabled(androidChannel, "chat");
        return (isConfigurationEnabled && androidChannel.containsKey(ViewProps.ENABLED)) ? getBoolean(androidChannel.get(ViewProps.ENABLED)) : isConfigurationEnabled;
    }

    public static boolean isChatQueueEnabled() {
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel == null || !androidChannel.containsKey("chat_waiting_queue")) {
            return false;
        }
        Hashtable hashtable = (Hashtable) androidChannel.get("chat_waiting_queue");
        if (hashtable.containsKey(ViewProps.ENABLED)) {
            return getBoolean(hashtable.get(ViewProps.ENABLED));
        }
        return false;
    }

    private static boolean isConfigurationEnabled(Hashtable hashtable, String str) {
        if (hashtable.containsKey("components")) {
            return ((ArrayList) hashtable.get("components")).contains(str);
        }
        return false;
    }

    public static boolean isConversationAllowedFromSalesIQ() {
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel != null) {
            r1 = androidChannel.containsKey("license_info") ? getBoolean(((Hashtable) androidChannel.get("license_info")).get("conversationallowed")) : false;
            if (r1) {
                return getBoolean(androidChannel.get("view_conversation"));
            }
        }
        return r1;
    }

    public static boolean isConversationEnabled() {
        return isConversationAllowedFromSalesIQ() && C6218a.M().getBoolean("enableconversation", true);
    }

    private static boolean isCreditCardNumber(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            char[] charArray = str.toCharArray();
            int length = str.length() % 2;
            int i10 = 0;
            for (int i11 = 0; i11 < charArray.length; i11++) {
                int intValue = Integer.valueOf(String.valueOf(charArray[i11])).intValue();
                if (i11 % 2 == length) {
                    intValue *= 2;
                }
                if (intValue > 9) {
                    intValue -= 9;
                }
                i10 += intValue;
            }
            return i10 % 10 == 0;
        } catch (Exception e10) {
            log(e10);
            return false;
        }
    }

    public static boolean isCurrentChatPKID(String str) {
        String string;
        return str != null && str.length() > 0 && (string = C6218a.M().getString("currentchat_pkid", null)) != null && string.equalsIgnoreCase(str);
    }

    public static boolean isEmailTranscriptOptionEnabled() {
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel != null) {
            return getBoolean(androidChannel.get("mail_transcript"));
        }
        return false;
    }

    public static boolean isEmbedAllowed() {
        SharedPreferences M10;
        return (C6218a.M() == null || (M10 = C6218a.M()) == null || M10.contains("embednotallowed")) ? false : true;
    }

    public static boolean isEnabled() {
        if (isEmbedAllowed() && isAppEnabled()) {
            return isChatEnabled() || Td.e.n0();
        }
        return false;
    }

    public static boolean isFileSharingEnabled() {
        Hashtable androidChannel = getAndroidChannel();
        boolean z10 = (androidChannel == null || !androidChannel.containsKey("license_info")) ? false : getBoolean(((Hashtable) androidChannel.get("license_info")).get("filesharing"));
        return z10 ? getBoolean(androidChannel.get("share_file")) : z10;
    }

    public static boolean isFormContextStarted() {
        if (C6218a.M() != null) {
            return C6218a.M().getBoolean("form_context_started", false);
        }
        return false;
    }

    public static boolean isGlobalGDPREnabled() {
        String string;
        if (C6218a.M() == null || (string = C6218a.M().getString("android_channel", null)) == null) {
            return false;
        }
        try {
            return getBoolean(((Hashtable) ((Hashtable) AbstractC6574b.d(string)).get("portal_config")).get("isgdprenabled"));
        } catch (Exception e10) {
            log(e10);
            return false;
        }
    }

    public static boolean isHideOutsideBusinessHours() {
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel == null || !androidChannel.containsKey("is_business_hours_enabled")) {
            return false;
        }
        return getBoolean(androidChannel.get("is_business_hours_enabled"));
    }

    public static boolean isHideWhenOffline() {
        Hashtable androidChannel = getAndroidChannel();
        return ((androidChannel == null || !androidChannel.containsKey("hide_when_offline")) ? false : getBoolean(androidChannel.get("hide_when_offline"))) && !getEmbedStatus();
    }

    public static boolean isMultipleChatsDisabled() {
        Hashtable androidChannel = getAndroidChannel();
        return !((androidChannel == null || !androidChannel.containsKey("allow_multiple_live_chat")) ? false : getBoolean(androidChannel.get("allow_multiple_live_chat")));
    }

    public static boolean isNotificationShown(String str, long j10) {
        Cursor cursor = null;
        try {
            try {
                cursor = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_NOTIFICATIONS WHERE CHATID = ? AND STIME = ?", new String[]{str, String.valueOf(j10)});
                boolean moveToFirst = cursor.moveToFirst();
                cursor.close();
                return moveToFirst;
            } catch (Exception e10) {
                log(e10);
                if (cursor == null) {
                    return false;
                }
                cursor.close();
                return false;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean isOpenChatAvailable() {
        Cursor cursor = null;
        try {
            try {
                cursor = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE STATUS != 4 AND STATUS != 3");
                if (cursor.getCount() > 0) {
                    cursor.close();
                    return true;
                }
            } catch (Exception e10) {
                log(e10);
                if (cursor == null) {
                    return false;
                }
            }
            cursor.close();
            return false;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public static boolean isProActiveChatAvailable() {
        Cursor cursor = null;
        try {
            try {
                cursor = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE STATUS == 7");
                if (cursor.getCount() > 0) {
                    cursor.close();
                    return true;
                }
            } catch (Exception e10) {
                log(e10);
                if (cursor == null) {
                    return false;
                }
            }
            cursor.close();
            return false;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public static boolean isProActiveFormContextStarted() {
        if (C6218a.M() != null) {
            return C6218a.M().getBoolean("proactive_form_context_started", false);
        }
        return false;
    }

    public static boolean isReopenEnabled() {
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel == null || !androidChannel.containsKey("allow_chat_reopen")) {
            return false;
        }
        return getBoolean(androidChannel.get("allow_chat_reopen"));
    }

    public static boolean isSDKDisabledWithOutsideBusinessHoursAndOffline() {
        return (isHideWhenOffline() || isHideOutsideBusinessHours()) && !isAnyChatsNeedToBeCompleted();
    }

    public static boolean isStartChatEnabled() {
        if (C6218a.M() != null) {
            return C6218a.M().getBoolean("start_chat_enabled", false);
        }
        return false;
    }

    public static boolean isSupportedVersion() {
        if (C6218a.M() != null) {
            SharedPreferences M10 = C6218a.M();
            return !M10.contains("unsupported") || M10.getInt("unsupported", -1) < getVersion();
        }
        return true;
    }

    public static boolean isTestDevice() {
        if (C6218a.M() != null) {
            return C6218a.M().getBoolean("istestdevice", false);
        }
        return false;
    }

    public static boolean isTriggerChatAvailable() {
        Cursor cursor = null;
        try {
            try {
                cursor = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE STATUS == 6 OR STATUS == 5");
                if (cursor.getCount() > 0) {
                    cursor.close();
                    return true;
                }
            } catch (Exception e10) {
                log(e10);
                if (cursor == null) {
                    return false;
                }
            }
            cursor.close();
            return false;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public static boolean isValidAttenderID(String str) {
        Cursor cursor = null;
        try {
            try {
                cursor = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE ATTENDER_ID = ?", new String[]{str});
                if (cursor.getCount() > 0) {
                    cursor.close();
                    return true;
                }
                cursor.close();
                return false;
            } catch (Exception e10) {
                log(e10);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public static boolean isVoiceMessageEnabled() {
        Hashtable androidChannel = getAndroidChannel();
        if (androidChannel == null || !androidChannel.containsKey("voice_notes_enabled")) {
            return false;
        }
        return getBoolean(androidChannel.get("voice_notes_enabled"));
    }

    public static void log(String str) {
        if (Q.o()) {
            Log.i("Mobilisten", str);
        }
    }

    private static void logHttpURLConnection(HttpURLConnection httpURLConnection) {
        if ("true".equals(System.getProperty("enable_salesiq_network_logs"))) {
            try {
                httpURLConnection.getRequestMethod();
                httpURLConnection.getURL().toString();
                for (Map.Entry<String, List<String>> entry : httpURLConnection.getRequestProperties().entrySet()) {
                    entry.getKey();
                    entry.getValue().get(0);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void open(Activity activity) {
        String str;
        boolean z10;
        if (activity == null || !isEnabled() || isSDKDisabledWithOutsideBusinessHoursAndOffline()) {
            return;
        }
        SalesIQChat recentChat = getRecentChat();
        boolean z11 = false;
        boolean z12 = true;
        if (canAllowOpenChatActivityInOfflineState(recentChat) || C6218a.c0()) {
            if (recentChat != null) {
                str = recentChat.getChid();
                z10 = false;
            } else {
                str = "temp_chid";
                z10 = true;
            }
            Intent intent = new Intent(activity, (Class<?>) ChatActivity.class);
            Bot bot = UTSUtil.getBot(UTSUtil.EVENT_WIDGET_INTERACTION, null);
            if (bot != null) {
                String uuid = UUID.randomUUID().toString();
                Tf.b.d(uuid, new WaitingChatDetails(bot.getId(), bot.getName(), false, uuid));
                if (!UTSUtil.hasTriggerBeenRequested() || uuid.equals(Tf.b.n())) {
                    Tf.b.P(uuid);
                } else {
                    z11 = true;
                }
                intent.putExtra("acknowledgement_key", uuid);
                intent.putExtra("chid", uuid);
                intent.putExtra("is_triggered_chat", true);
                intent.putExtra("is_widget_interaction", true);
                intent.putExtra("initiate_trigger_api", z11);
            }
            intent.putExtra("chid", str);
            intent.putExtra("mode", "SINGLETASK");
            intent.setFlags(268435456);
            activity.startActivity(intent);
            z12 = z10;
        } else {
            Toast.makeText(activity, od.t.f61107s, 0).show();
        }
        UTSUtil.updateSDKOpen(z12);
    }

    public static void openChat(Activity activity, boolean z10, boolean z11, boolean z12, boolean z13) {
        openChat(activity, null, z10, z11, z12, z13, null, null, null);
    }

    public static void openNewChat(Activity activity, boolean z10, boolean z11) {
        String str;
        Intent intent;
        if (activity == null || !isEnabled() || isSDKDisabledWithOutsideBusinessHoursAndOffline()) {
            return;
        }
        SalesIQChat recentChat = getRecentChat();
        boolean z12 = false;
        boolean z13 = true;
        if (canAllowOpenChatActivityInOfflineState(recentChat) || C6218a.c0()) {
            if (recentChat != null) {
                str = recentChat.getChid();
            } else {
                str = "temp_chid";
                z12 = true;
            }
            if (z10) {
                intent = new Intent(activity, (Class<?>) SalesIQActivity.class);
                intent.putExtra("open_chat_window", true);
            } else {
                intent = new Intent(activity, (Class<?>) ChatActivity.class);
            }
            intent.putExtra("can_skip_pre_chat_form", z11);
            intent.putExtra("chid", str);
            intent.putExtra("mode", "SINGLETASK");
            intent.setFlags(268435456);
            activity.startActivity(intent);
            z13 = z12;
        } else {
            Toast.makeText(activity, od.t.f61107s, 0).show();
        }
        UTSUtil.updateSDKOpen(z13);
    }

    public static void openUri(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e10) {
            log(e10);
            if (e10 instanceof ActivityNotFoundException) {
                Toast.makeText(context, od.t.f61039i, 0).show();
            }
        }
    }

    public static void openUrl(String str) {
        if (str == null || !Pattern.compile(REGEX_URL).matcher(str).find()) {
            return;
        }
        try {
            if (!str.startsWith("http://") && !str.startsWith("https://")) {
                str = "https://" + str;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.setFlags(268435456);
            MobilistenInitProvider.k().startActivity(intent);
        } catch (Exception e10) {
            ZohoLiveChat.getApplicationManager();
            Toast.makeText(Uf.j.n(), "You don't have an application to open this web page", 0).show();
            log(e10);
        }
    }

    public static void reInitialiseExecutorService() {
        executorService.shutdown();
        executorService.shutdownNow();
        try {
            executorService.awaitTermination(5L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
        }
        executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);
    }

    public static void registerVisitor(@NonNull String str, RegisterListener registerListener) {
        if (Ed.a.x()) {
            if (registerListener != null) {
                registerListener.onFailure(6303, "Cannot use registerVisitor method when user is logged in.");
                return;
            }
            return;
        }
        if (!C6218a.c0()) {
            if (registerListener != null) {
                registerListener.onFailure(600, "No network connection");
            }
        } else if (MobilistenUtil.j()) {
            if (registerListener != null) {
                registerListener.onFailure(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION, "Mobilisten not initialized");
            }
        } else if (!str.trim().isEmpty() && Pattern.matches(REGISTER_VISITOR_PATTERN, str)) {
            setCVUID(str, registerListener, null);
        } else if (registerListener != null) {
            registerListener.onFailure(615, String.format("Invalid ID : %s | Given id should match %s this pattern", str, REGISTER_VISITOR_PATTERN));
        }
    }

    public static void removeActiveChatPKID() {
        SharedPreferences.Editor edit = C6218a.M().edit();
        edit.remove("activechat_pkid");
        edit.apply();
    }

    public static void removeCurrentChatPKID() {
        if (C6218a.M() != null) {
            SharedPreferences.Editor edit = C6218a.M().edit();
            edit.remove("currentchat_pkid");
            edit.apply();
        }
    }

    public static boolean requireChatGDPRConsent() {
        return getChatConsentConfig() == 1 && !(C6218a.M() != null ? C6218a.M().getBoolean("chat_gdpr_consent", false) : false);
    }

    public static void setAVUID(String str) {
        if (C6218a.M() != null) {
            SharedPreferences.Editor edit = C6218a.M().edit();
            edit.putString("avuid", str);
            edit.apply();
        }
    }

    public static void setActiveChatPKID(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        SharedPreferences.Editor edit = C6218a.M().edit();
        edit.putString("activechat_pkid", str);
        edit.apply();
    }

    public static boolean setCVUID(final String str, RegisterListener registerListener, UnRegisterListener unRegisterListener) {
        if (C6218a.M() != null) {
            String cvuid = getCVUID();
            if (cvuid == null || !cvuid.equalsIgnoreCase(str)) {
                setAVUID(null);
                if (ZohoLiveChat.getApplicationManager() != null) {
                    if (registerListener != null) {
                        ZohoLiveChat.getApplicationManager().V(registerListener);
                    }
                    if (unRegisterListener != null) {
                        ZohoLiveChat.getApplicationManager().W(unRegisterListener);
                    }
                    submitTaskToExecutorServiceSafely(new Runnable() { // from class: com.zoho.livechat.android.utils.D
                        @Override // java.lang.Runnable
                        public final void run() {
                            ZohoLiveChat.clearDataForRegisterVisitor(MobilistenInitProvider.k(), true, true, null, str, null);
                        }
                    });
                    return true;
                }
                if (registerListener != null) {
                    registerListener.onFailure(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION, "Mobilisten not initialized");
                }
                if (unRegisterListener != null) {
                    unRegisterListener.onFailure(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION, "Mobilisten not initialized");
                    return false;
                }
            } else {
                if (registerListener != null) {
                    registerListener.onSuccess();
                }
                if (unRegisterListener != null) {
                    unRegisterListener.onFailure(601, "operation failed");
                    return false;
                }
            }
        } else {
            if (registerListener != null) {
                registerListener.onFailure(601, "operation failed");
            }
            if (unRegisterListener != null) {
                unRegisterListener.onFailure(601, "operation failed");
            }
        }
        return false;
    }

    public static void setCurrentChatID(String str) {
        if (str == null || str.length() <= 0 || C6218a.M() == null) {
            return;
        }
        currentChatId = str;
    }

    public static void setCurrentChatPKID(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        SharedPreferences.Editor edit = C6218a.M().edit();
        edit.putString("currentchat_pkid", str);
        edit.apply();
    }

    public static void setEmbedWaitingTime(long j10) {
        if (C6218a.M() != null) {
            SharedPreferences.Editor edit = C6218a.M().edit();
            edit.putLong("waitingTime", j10);
            edit.apply();
        }
    }

    public static void setFormContextCompleted() {
        C6822a.f();
        if (C6218a.M() != null) {
            SharedPreferences.Editor edit = C6218a.M().edit();
            edit.putBoolean("form_context_started", false);
            edit.putBoolean("proactive_form_context_started", false);
            edit.apply();
        }
    }

    public static void setFormContextStarted() {
        if (C6218a.M() != null) {
            SharedPreferences.Editor edit = C6218a.M().edit();
            edit.putBoolean("form_context_started", true);
            edit.apply();
        }
    }

    public static void setProActiveFormContextStarted() {
        if (C6218a.M() != null) {
            SharedPreferences.Editor edit = C6218a.M().edit();
            edit.putBoolean("proactive_form_context_started", true);
            edit.apply();
        }
    }

    public static void setStartChatDisabled() {
        if (C6218a.M() != null) {
            SharedPreferences.Editor edit = C6218a.M().edit();
            edit.putBoolean("start_chat_enabled", false);
            edit.apply();
        }
    }

    public static void setStartChatEnabled() {
        if (C6218a.M() != null) {
            SharedPreferences.Editor edit = C6218a.M().edit();
            edit.putBoolean("start_chat_enabled", true);
            edit.apply();
        }
    }

    public static boolean showEmailTranscript() {
        if (C6218a.M() != null) {
            return C6218a.M().getBoolean("email_transcript", true);
        }
        return true;
    }

    public static void showFeedbackDialog(Context context, SalesIQChat salesIQChat) {
        showFeedbackDialog(context, salesIQChat, -1);
    }

    public static boolean showFileShare() {
        if (C6218a.M() != null) {
            return C6218a.M().getBoolean("file_share", true);
        }
        return true;
    }

    public static void showKeyboard(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 2, null);
        }
    }

    public static boolean showVisitorName() {
        try {
            if (C6218a.M() != null) {
                return C6218a.M().getBoolean("visitor_name", false);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void submitTaskToExecutorServiceSafely(Runnable runnable) {
        if (!executorService.isShutdown()) {
            executorService.submit(runnable);
            return;
        }
        try {
            executorService.awaitTermination(5L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            executorService.shutdown();
            try {
                executorService.awaitTermination(5L, TimeUnit.SECONDS);
            } catch (InterruptedException unused2) {
            }
        }
        executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);
    }

    public static void syncFormConfiguration(boolean z10, final Function0<Unit> function0) {
        C6822a.D(!isFormContextStarted(), com.zoho.livechat.android.modules.brand.ui.helpers.a.r(false, z10, null), new Function0() { // from class: com.zoho.livechat.android.utils.H
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveChatUtil.b(Function0.this);
            }
        });
    }

    public static void triggerChatListener(String str, SalesIQChat salesIQChat) {
        triggerChatListener(str, salesIQChat, null);
    }

    public static void triggerInitListener(boolean z10, int i10, String str, InitListener initListener) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(EventKeys.ERROR_CODE, i10);
            jSONObject2.put("message", str);
            jSONObject.put("error", jSONObject2);
        } catch (Exception e10) {
            log(e10);
        }
        triggerInitListener(z10, AbstractC6574b.g(jSONObject), initListener);
    }

    public static void triggerSalesIQListener(final String str, final String str2, final od.x xVar) {
        final SalesIQListener listener = ZohoLiveChat.getListener();
        if (listener == null || ZohoLiveChat.getApplicationManager() == null) {
            return;
        }
        ZohoLiveChat.getApplicationManager().p().post(new Runnable() { // from class: com.zoho.livechat.android.utils.I
            @Override // java.lang.Runnable
            public final void run() {
                LiveChatUtil.f(str, listener, str2, xVar);
            }
        });
    }

    public static void unRegisterDevice() {
        unRegisterDevice(null);
    }

    public static String unescapeHtml(String str) {
        return str != null ? str.replaceAll("&lt;", "<").replaceAll("&gt;", ">").replaceAll("&quot;", "\"").replaceAll("&apos;", "'").replaceAll("&amp;", "&").replaceAll("&#39;", "'").replaceAll("&#x21;", "!").replaceAll("&#x40;", "@").replaceAll("&#x3a;", ":").replaceAll("&nbsp;", " ").replaceAll("<br/>", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).replaceAll("<br>", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).replaceAll("&#x3d;", "=").replaceAll("&#x27;", "'").replaceAll("&#x28;", "(").replaceAll("&#x29;", ")").replaceAll("&#x2f;", "/").replaceAll("&#x3f;", "?").replaceAll("&#x3e;", ">").replaceAll("&#x22;", "\"").replaceAll("&#x23;", "#").replaceAll("&#x24;", "$") : str;
    }

    public static void updateBadgeListener(int i10) {
        updateBadgeListener(i10, true);
    }

    public static ArrayList<String> getAllOpenChatIds(SalesIQChat.c cVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        String str = "SELECT * FROM SIQ_CONVERSATIONS WHERE STATUS != 4 AND STATUS != 3";
        if (cVar != null) {
            str = "SELECT * FROM SIQ_CONVERSATIONS WHERE STATUS != 4 AND STATUS != 3 AND TYPE = '" + cVar.value + "'";
        }
        Cursor cursor = null;
        try {
            try {
                cursor = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery(str + " ORDER BY LMTIME DESC");
                if (cursor.moveToFirst()) {
                    while (!cursor.isAfterLast()) {
                        arrayList.add(cursor.getString(cursor.getColumnIndex("CHATID")));
                        cursor.moveToNext();
                    }
                }
                cursor.close();
                return arrayList;
            } catch (Exception e10) {
                log(e10);
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public static HttpURLConnection getCommonHeaders(HttpURLConnection httpURLConnection, boolean z10) {
        httpURLConnection.setRequestProperty("X-SIQ-Channel", Constants.PLATFORM_ANDROID);
        httpURLConnection.addRequestProperty("X-Mobilisten-Version", "" + getVersion());
        httpURLConnection.addRequestProperty("X-Mobilisten-Version-Name", getMobilistenVersionName());
        httpURLConnection.addRequestProperty("X-Mobilisten-Platform", getPlatformName());
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        String d10 = MobilistenUtil.d();
        String c10 = MobilistenUtil.c();
        if (d10 != null) {
            httpURLConnection.addRequestProperty("x-appkey", d10);
        } else {
            log("App key is null " + Log.getStackTraceString(new Throwable()));
        }
        if (c10 != null) {
            httpURLConnection.addRequestProperty("x-accesskey", c10);
        } else {
            log("Access key is null " + Log.getStackTraceString(new Throwable()));
        }
        De.a aVar = De.a.JwtAccessToken;
        String k10 = Ye.d.k(aVar);
        if (Ed.a.x() && z10) {
            String appID = getAppID();
            if (appID != null && !TextUtils.isEmpty(appID)) {
                httpURLConnection.addRequestProperty("x-siq-appid", appID);
            }
            Bd.b t10 = Ed.a.t();
            if (Ed.a.v()) {
                if ((k10 == null || TextUtils.isEmpty(k10)) && t10 != null) {
                    Ed.a.f(t10, Bd.a.ApiCallValidation);
                }
            } else if (t10 != null) {
                Ed.a.f(t10, Bd.a.ApiCallValidation);
            }
            String k11 = Ye.d.k(aVar);
            if (k11 != null && !TextUtils.isEmpty(k11)) {
                httpURLConnection.addRequestProperty("x-siq-accesstoken", k11);
            }
        } else {
            log("JWT- LiveChatUtil, User is not logged in. Request: " + z10 + " " + httpURLConnection.getURL());
        }
        if (MobilistenUtil.g() != null) {
            httpURLConnection.addRequestProperty("x-bundleid", MobilistenUtil.g());
        }
        logHttpURLConnection(httpURLConnection);
        return httpURLConnection;
    }

    public static ArrayList<String> getConnectedChatIds(SalesIQChat.c cVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = {"2"};
        String str = "SELECT * FROM SIQ_CONVERSATIONS WHERE STATUS = ?";
        if (cVar != null) {
            str = "SELECT * FROM SIQ_CONVERSATIONS WHERE STATUS = ? AND TYPE = ?";
            strArr = (String[]) Arrays.copyOf(strArr, 2);
            strArr[strArr.length - 1] = cVar.value;
        }
        Cursor cursor = null;
        try {
            try {
                cursor = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery(str + " ORDER BY LMTIME DESC", strArr);
                if (cursor.moveToFirst()) {
                    while (!cursor.isAfterLast()) {
                        arrayList.add(cursor.getString(cursor.getColumnIndex("CHATID")));
                        cursor.moveToNext();
                    }
                }
                cursor.close();
                return arrayList;
            } catch (Exception e10) {
                log(e10);
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public static ArrayList<SalesIQChat> getConversations(String str) {
        return getConversations(str, null);
    }

    public static ArrayList<String> getOpenChatIds(SalesIQChat.c cVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        String str = "SELECT * FROM SIQ_CONVERSATIONS WHERE STATUS != 4";
        if (cVar != null) {
            str = "SELECT * FROM SIQ_CONVERSATIONS WHERE STATUS != 4 AND TYPE = '" + cVar.value + "'";
        }
        Cursor cursor = null;
        try {
            try {
                cursor = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery(str);
                if (cursor.moveToFirst()) {
                    while (!cursor.isAfterLast()) {
                        arrayList.add(cursor.getString(cursor.getColumnIndex("CHATID")));
                        cursor.moveToNext();
                    }
                }
                cursor.close();
                return arrayList;
            } catch (Exception e10) {
                log(e10);
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public static String getVisitorName(boolean z10) {
        De.a aVar = De.a.VisitorName;
        String k10 = Ye.d.k(aVar);
        if (k10 != null || !z10) {
            return k10;
        }
        String str = "Visitor " + (new SecureRandom().nextInt(900000) + 10000);
        Ye.d.r(aVar, str).b(true);
        return str;
    }

    public static void openChat(Activity activity, String str, boolean z10, boolean z11, boolean z12, boolean z13, ZohoSalesIQ.l lVar, Function1<Boolean, Unit> function1, InterfaceC6686a interfaceC6686a) {
        if (activity != null && isEnabled() && !isSDKDisabledWithOutsideBusinessHoursAndOffline()) {
            Ye.a.m(activity, str, z10, z11, z12, z13, lVar, function1, interfaceC6686a);
        } else {
            if (interfaceC6686a == null) {
                return;
            }
            we.d z14 = com.zoho.livechat.android.modules.brand.ui.helpers.a.z();
            if (z14 == null) {
                z14 = we.d.f67649d;
            }
            interfaceC6686a.a(we.e.a(z14));
        }
    }

    public static void showFeedbackDialog(Context context, SalesIQChat salesIQChat, int i10) {
        if (salesIQChat == null || context == null) {
            return;
        }
        if (canShowFeedback() || canShowRating()) {
            log("showFeedbackDialog: " + Log.getStackTraceString(new Throwable()));
            final Dialog dialog = new Dialog(context, od.u.f61161g);
            dialog.setContentView(od.r.f60796m);
            if (dialog.getWindow() != null) {
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                dialog.getWindow().getAttributes().gravity = 80;
                dialog.getWindow().setSoftInputMode(16);
                final EditText editText = (EditText) dialog.findViewById(od.q.f60710y3);
                RelativeLayout relativeLayout = (RelativeLayout) dialog.findViewById(od.q.f60213B3);
                new Xf.h(context, relativeLayout, i10).p(dialog, salesIQChat);
                dialog.show();
                relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zoho.livechat.android.utils.F
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LiveChatUtil.e(editText, dialog, view);
                    }
                });
            }
        }
    }

    public static void triggerChatListener(final String str, final SalesIQChat salesIQChat, final we.b bVar) {
        final String str2;
        final SalesIQChatListener listener = ZohoSalesIQ.Chat.getListener();
        if ((listener == null && (salesIQChat == null || salesIQChat.getType() != SalesIQChat.c.Call)) || ZohoLiveChat.getApplicationManager() == null || ZohoLiveChat.getApplicationManager().p() == null) {
            return;
        }
        if (salesIQChat != null) {
            str2 = salesIQChat.getVisitid() != null ? salesIQChat.getVisitid() : salesIQChat.getConvID();
        } else {
            str2 = null;
        }
        final VisitorChat visitorChatObject = salesIQChat != null ? getVisitorChatObject(salesIQChat) : null;
        ZohoLiveChat.getApplicationManager().p().post(new Runnable() { // from class: com.zoho.livechat.android.utils.C
            @Override // java.lang.Runnable
            public final void run() {
                LiveChatUtil.d(SalesIQChat.this, str, str2, listener, visitorChatObject, bVar);
            }
        });
    }

    public static void unRegisterDevice(N.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("os", Constants.PLATFORM_ANDROID);
        hashMap.put("test_device", String.valueOf(isTestDevice()));
        hashMap.put("registration_id", getFCMId());
        hashMap.put("installation_id", getInsID());
        if (getFCMId() != null) {
            submitTaskToExecutorServiceSafely(new N(getAnnonID(), getScreenName(), hashMap, false, aVar));
        } else if (aVar != null) {
            aVar.invoke();
        }
    }

    public static void updateBadgeListener(final int i10, boolean z10) {
        if (z10) {
            Q.f44447F.J(false);
        }
        if (ZohoSalesIQ.j.f() == null || ZohoLiveChat.getApplicationManager() == null || badgeCount == i10) {
            return;
        }
        badgeCount = i10;
        ZohoLiveChat.getApplicationManager().p().post(new Runnable() { // from class: com.zoho.livechat.android.utils.G
            @Override // java.lang.Runnable
            public final void run() {
                ZohoSalesIQ.j.f().onBadgeChange(i10);
            }
        });
    }

    public static ArrayList<SalesIQChat> getConversations(String str, SalesIQChat.c cVar) {
        String[] strArr;
        ArrayList<SalesIQChat> arrayList = new ArrayList<>();
        String str2 = "SELECT * FROM SIQ_CONVERSATIONS";
        if (str == null || str.isEmpty()) {
            strArr = null;
        } else {
            String str3 = "SELECT * FROM SIQ_CONVERSATIONS WHERE (ATTENDER LIKE ? OR ((QUESTION LIKE ? OR VISITID LIKE ?) AND TYPE = '" + SalesIQChat.c.Chat.value + "') OR ((DEPTNAME LIKE ? ";
            if (Td.e.B() != null && !Td.e.B().isEmpty() && Td.e.B().toLowerCase().contains(str.toLowerCase())) {
                str3 = str3 + "OR ATTENDER IS NULL OR ATTENDER = ''";
            }
            str2 = str3 + ") AND TYPE = '" + SalesIQChat.c.Call.value + "'))";
            String str4 = "%" + str + "%";
            strArr = new String[]{str4, str4, str4, str4};
        }
        if (cVar != null) {
            str2 = str2 + " AND TYPE = ?";
            if (strArr == null) {
                strArr = new String[]{cVar.value};
            } else {
                strArr = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
                strArr[strArr.length - 1] = cVar.value;
            }
        }
        try {
            Cursor executeRawQuery = com.zoho.livechat.android.provider.a.INSTANCE.executeRawQuery(str2 + " ORDER BY LMTIME DESC", strArr);
            try {
                executeRawQuery.moveToFirst();
                while (!executeRawQuery.isAfterLast()) {
                    arrayList.add(new SalesIQChat(executeRawQuery));
                    executeRawQuery.moveToNext();
                }
                executeRawQuery.close();
                return arrayList;
            } finally {
            }
        } catch (Exception e10) {
            log(e10);
            return arrayList;
        }
    }

    public static void log(Throwable th2) {
        if (!Q.o() || th2 == null) {
            return;
        }
        Log.e("Mobilisten", th2.getMessage(), th2);
    }

    public static void triggerInitListener(final boolean z10, final String str, final InitListener initListener) {
        if (initListener == null) {
            initListener = ZohoLiveChat.getApplicationManager() != null ? ZohoLiveChat.getApplicationManager().r() : null;
        }
        if (initListener != null) {
            ZohoLiveChat.getApplicationManager().p().post(new Runnable() { // from class: com.zoho.livechat.android.utils.E
                @Override // java.lang.Runnable
                public final void run() {
                    LiveChatUtil.a(z10, initListener, str);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (com.facebook.hermes.intl.Constants.COLLATION_DEFAULT.equalsIgnoreCase(r2) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getLanguageOrNull(Hashtable hashtable) {
        String string;
        if (hashtable != null || !Uf.j.f12224n) {
            if (Uf.j.f12224n) {
                string = getString(hashtable.get("language"));
            } else {
                string = C6218a.M().getString("mobilisten_locale", Locale.getDefault().getLanguage());
            }
            if (string.trim().length() > 0) {
            }
        }
        string = null;
        return (ZohoSalesIQ.Chat.getLanguage() == null || ZohoSalesIQ.Chat.getLanguage().trim().length() <= 0) ? string : ZohoSalesIQ.Chat.getLanguage();
    }

    public static void openNewChat(Activity activity) {
        if (activity == null || !isEnabled()) {
            return;
        }
        if (C6218a.c0()) {
            Intent intent = new Intent(activity, (Class<?>) ChatActivity.class);
            intent.putExtra("chid", "temp_chid");
            intent.putExtra("mode", "SINGLETASK");
            intent.setFlags(268435456);
            activity.startActivity(intent);
            return;
        }
        Toast.makeText(activity, od.t.f61107s, 0).show();
    }

    public static void open(Activity activity, String str) {
        SalesIQChat chatWithAnyId;
        if (activity == null || !isEnabled() || isSDKDisabledWithOutsideBusinessHoursAndOffline() || str == null || (chatWithAnyId = getChatWithAnyId(str)) == null || chatWithAnyId.getType() != SalesIQChat.c.Chat) {
            return;
        }
        if (!canAllowOpenChatActivityInOfflineState(chatWithAnyId) && !C6218a.c0()) {
            Toast.makeText(activity, od.t.f61107s, 0).show();
        } else {
            String chid = chatWithAnyId.getChid();
            Intent intent = new Intent(activity, (Class<?>) ChatActivity.class);
            intent.putExtra("chid", chid);
            intent.putExtra("mode", "SINGLETASK");
            intent.setFlags(268435456);
            activity.startActivity(intent);
        }
        UTSUtil.updateSDKOpen(false);
    }
}
