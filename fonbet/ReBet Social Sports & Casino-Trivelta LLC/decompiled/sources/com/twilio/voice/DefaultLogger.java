package com.twilio.voice;

import android.util.Log;
import androidx.annotation.NonNull;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;

/* loaded from: classes4.dex */
class DefaultLogger implements LoggerInterface {

    /* renamed from: com.twilio.voice.DefaultLogger$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$twilio$voice$LogLevel;
        static final /* synthetic */ int[] $SwitchMap$com$twilio$voice$LogModule;

        static {
            int[] iArr = new int[LogModule.values().length];
            $SwitchMap$com$twilio$voice$LogModule = iArr;
            try {
                iArr[LogModule.CORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogModule[LogModule.SIGNALING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogModule[LogModule.WEBRTC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogModule[LogModule.PLATFORM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[LogLevel.values().length];
            $SwitchMap$com$twilio$voice$LogLevel = iArr2;
            try {
                iArr2[LogLevel.FATAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogLevel[LogLevel.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogLevel[LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogLevel[LogLevel.INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogLevel[LogLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogLevel[LogLevel.TRACE.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogLevel[LogLevel.ALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogLevel[LogLevel.OFF.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private String convertModuleToString(LogModule logModule) {
        String str = new String();
        int i10 = AnonymousClass1.$SwitchMap$com$twilio$voice$LogModule[logModule.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? str : "Platform" : "WebRTC" : "Signaling" : zendesk.core.Constants.VARIANT;
    }

    @Override // com.twilio.voice.LoggerInterface
    public void log(@NonNull LogParameters logParameters) {
        String str;
        Preconditions.checkNotNull(logParameters, "LogParameters object must not be null");
        String str2 = "[" + convertModuleToString(logParameters.module) + "] ";
        if (logParameters.tag.isEmpty()) {
            str = "Twilio";
        } else {
            str = "Twilio:" + logParameters.tag;
        }
        String str3 = str2 + logParameters.message;
        if (logParameters.tr != null) {
            str3 = str3 + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + Log.getStackTraceString(logParameters.tr);
        }
        int i10 = AnonymousClass1.$SwitchMap$com$twilio$voice$LogLevel[logParameters.level.ordinal()];
        if (i10 == 1 || i10 == 2) {
            Log.e(str, str3);
        } else if (i10 == 3) {
            Log.w(str, str3);
        } else {
            if (i10 != 4) {
                return;
            }
            Log.i(str, str3);
        }
    }
}
