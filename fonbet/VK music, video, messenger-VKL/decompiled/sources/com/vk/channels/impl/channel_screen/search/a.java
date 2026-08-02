package com.vk.channels.impl.channel_screen.search;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import com.vk.im.engine.models.messages.MsgFromChannel;
import java.util.ArrayList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.text.Regex;
import xsna.e43;
import xsna.fpf0;
import xsna.hdp;
import xsna.ine0;
import xsna.mx30;
import xsna.nik0;
import xsna.qcy;
import xsna.re0;
import xsna.up2;
import xsna.wqo0;

/* compiled from: ChannelMsgSearchFormatter.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes16.dex */
public final class a {
    public static final a a;
    public static final /* synthetic */ qcy<Object>[] b;
    public static final wqo0 c;
    public static final com.vk.im.ui.formatters.a d;
    public static final hdp e;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(a.class, "builder", "getBuilder()Landroid/text/SpannableStringBuilder;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
        a = new a();
        c = new wqo0(new re0(4));
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        d = new com.vk.im.ui.formatters.a(context);
        e = hdp.a;
    }

    public static SpannableString a(MsgFromChannel msgFromChannel, ArrayList arrayList) {
        ArrayList s = up2.s(arrayList);
        String q = msgFromChannel.I.a.length() > 0 ? ine0.q(msgFromChannel.I.a) : "";
        b().clear();
        if (q.length() > 0) {
            b().append(e.a(new Regex("\n").g(q, " ")));
        }
        mx30 mx30Var = mx30.a;
        SpannableStringBuilder b2 = b();
        mx30Var.getClass();
        mx30.c(b2, arrayList, s);
        if (b2.length() == 0 && msgFromChannel.g8()) {
            b2.append(d.b(msgFromChannel));
        }
        SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
        return new SpannableString(b2);
    }

    public static SpannableStringBuilder b() {
        qcy<Object> qcyVar = b[0];
        wqo0 wqo0Var = c;
        wqo0Var.getClass();
        return (SpannableStringBuilder) wqo0Var.get();
    }
}
