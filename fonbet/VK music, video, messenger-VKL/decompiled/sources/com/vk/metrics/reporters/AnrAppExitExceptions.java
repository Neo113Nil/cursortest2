package com.vk.metrics.reporters;

import kotlin.text.Regex;
import xsna.bpn0;
import xsna.dv2;
import xsna.e20;
import xsna.epx;
import xsna.f20;
import xsna.jg0;
import xsna.wb1;

/* compiled from: AnrAppExitExceptions.kt */
/* loaded from: classes3.dex */
public abstract class AnrAppExitExceptions extends Exception {
    public static final bpn0 b = new bpn0(new e20(1));
    public static final bpn0 c = new bpn0(new f20(2));
    public static final bpn0 d = new bpn0(new wb1(1));
    public static final bpn0 e = new bpn0(new dv2(0));
    public static final bpn0 f = new bpn0(new jg0(1));

    /* compiled from: AnrAppExitExceptions.kt */
    public static final class BackgroundAnrException extends AnrAppExitExceptions {
    }

    /* compiled from: AnrAppExitExceptions.kt */
    public static final class BroadcastOfIntentException extends AnrAppExitExceptions {
    }

    /* compiled from: AnrAppExitExceptions.kt */
    public static final class CommonException extends AnrAppExitExceptions {
    }

    /* compiled from: AnrAppExitExceptions.kt */
    public static final class ExecutingServiceException extends AnrAppExitExceptions {
    }

    /* compiled from: AnrAppExitExceptions.kt */
    public static final class InputDispatchingException extends AnrAppExitExceptions {
    }

    /* compiled from: AnrAppExitExceptions.kt */
    public static final class RequestAfterErrorException extends AnrAppExitExceptions {
    }

    /* compiled from: AnrAppExitExceptions.kt */
    public static final class a {
        public static AnrAppExitExceptions a(String str, String str2) {
            return epx.f(str, (String) AnrAppExitExceptions.e.getValue()) ? new BackgroundAnrException(str2) : epx.f(str, (String) AnrAppExitExceptions.f.getValue()) ? new RequestAfterErrorException(str2) : (str == null || !((Regex) AnrAppExitExceptions.b.getValue()).f(str)) ? (str == null || !((Regex) AnrAppExitExceptions.c.getValue()).f(str)) ? (str == null || !((Regex) AnrAppExitExceptions.d.getValue()).f(str)) ? new CommonException(str2) : new InputDispatchingException(str2) : new BroadcastOfIntentException(str2) : new ExecutingServiceException(str2);
        }
    }
}
