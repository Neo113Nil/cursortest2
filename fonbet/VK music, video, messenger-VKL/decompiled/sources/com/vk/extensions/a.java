package com.vk.extensions;

import android.content.Context;
import android.content.Intent;
import android.util.Size;
import com.vk.common.links.LaunchContext;
import com.vk.common.links.b;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionCloseWebApp;
import com.vk.dto.common.actions.ActionEnableTopNews;
import com.vk.dto.common.actions.ActionOpenConversation;
import com.vk.dto.common.actions.ActionOpenInternalVkUi;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.common.actions.ActionOpenVkApp;
import com.vk.dto.common.actions.ActionPhoneCall;
import com.vk.dto.common.actions.ActionSendMarketMessage;
import com.vk.dto.common.actions.ActionShareUrl;
import com.vk.dto.common.actions.ActionShowFullPost;
import com.vk.dto.common.actions.ButtonContext;
import com.vk.dto.common.actions.snackbar.ActionShowSnackbar;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.ce60;
import xsna.epx;
import xsna.f870;
import xsna.g2v;
import xsna.gcd0;
import xsna.hf3;
import xsna.ikv0;
import xsna.kbj0;
import xsna.maz;
import xsna.mq20;
import xsna.np20;
import xsna.nr4;
import xsna.o0w;
import xsna.p870;
import xsna.pdv0;
import xsna.qdz;
import xsna.qex0;
import xsna.qr;
import xsna.rf3;
import xsna.vtk0;
import xsna.xwk;

/* compiled from: ActionExt.kt */
/* loaded from: classes18.dex */
public final class a {
    public static final LaunchContext a(String str, String str2, Integer num, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        return ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) ? new LaunchContext(false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, num, searchStatsLoggingInfo, null, null, false, false, null, null, null, 66715647) : new LaunchContext(false, false, false, str, str2, null, null, null, null, null, null, false, false, false, null, num, searchStatsLoggingInfo, null, null, false, false, null, null, null, 66715623);
    }

    public static void b(Action action, Context context, NewsEntry newsEntry, String str, String str2, List list, String str3, Integer num, SearchStatsLoggingInfo searchStatsLoggingInfo, int i) {
        NewsEntry newsEntry2 = (i & 2) != 0 ? null : newsEntry;
        String str4 = (i & 4) != 0 ? null : str;
        String str5 = (i & 8) != 0 ? null : str2;
        List list2 = (i & 16) != 0 ? null : list;
        String str6 = (i & 32) != 0 ? null : str3;
        Integer num2 = (i & 64) != 0 ? null : num;
        SearchStatsLoggingInfo searchStatsLoggingInfo2 = (i & 128) != 0 ? null : searchStatsLoggingInfo;
        if (action instanceof ActionOpenUrl) {
            LaunchContext a = a(str4, str5, num2, searchStatsLoggingInfo2);
            ActionOpenUrl actionOpenUrl = (ActionOpenUrl) action;
            qdz qdzVar = b.a;
            if (actionOpenUrl != null) {
                ActionOpenUrl.Target target = actionOpenUrl.d;
                String str7 = actionOpenUrl.c;
                if (ActionOpenUrl.Target.external == target) {
                    b.c(context, str7, null);
                    return;
                }
                if (ActionOpenUrl.Target.f88internal == target) {
                    b.e(context, null, a, str7);
                    return;
                } else if (ActionOpenUrl.Target.authorize == target) {
                    b.j(context, str7);
                    return;
                } else {
                    b.a.e().a(context, str7);
                    return;
                }
            }
            return;
        }
        if (action instanceof ActionOpenVkApp) {
            LaunchContext a2 = a(str4, str5, null, null);
            maz e = xwk.d().e();
            ButtonContext buttonContext = ((ActionOpenVkApp) action).f;
            maz.c(e, context, buttonContext != null ? buttonContext.d : null, a2, null, null, 24);
            return;
        }
        if (action instanceof ActionShowFullPost) {
            if (newsEntry2 instanceof Post) {
                Post post = (Post) newsEntry2;
                ActionShowFullPost actionShowFullPost = (ActionShowFullPost) action;
                if (epx.f(post.m, actionShowFullPost.c) && post.n == actionShowFullPost.d) {
                    pdv0.a c = vtk0.c().c(newsEntry2);
                    c.J(actionShowFullPost.e);
                    c.k(context);
                    return;
                }
            }
            ActionShowFullPost actionShowFullPost2 = (ActionShowFullPost) action;
            gcd0.s(context, actionShowFullPost2.c, actionShowFullPost2.d, 0);
            return;
        }
        if (action instanceof ActionOpenInternalVkUi) {
            ActionOpenInternalVkUi actionOpenInternalVkUi = (ActionOpenInternalVkUi) action;
            hf3.d(new np20((int) f870.r(actionOpenInternalVkUi.c, qex0.a.b()), context, new mq20(actionOpenInternalVkUi.c, (String) null, (String) null, (String) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (String) null, (String) null), null, null, 24));
            return;
        }
        if (action instanceof ActionEnableTopNews) {
            ce60.b.getClass();
            p870.f().c(108);
            return;
        }
        if (action instanceof ActionPhoneCall) {
            ActionPhoneCall actionPhoneCall = (ActionPhoneCall) action;
            context.startActivity(Intent.createChooser(new Intent("android.intent.action.DIAL", rf3.c(actionPhoneCall.c, new StringBuilder("tel:"))), actionPhoneCall.c));
            return;
        }
        if (action instanceof ActionSendMarketMessage) {
            ActionSendMarketMessage actionSendMarketMessage = (ActionSendMarketMessage) action;
            if (actionSendMarketMessage.c != 0) {
                o0w b = g2v.c().b();
                long j = actionSendMarketMessage.c;
                String str8 = actionSendMarketMessage.d;
                String str9 = str8 == null ? str6 == null ? "" : str6 : str8;
                if (list2 == null) {
                    list2 = EmptyList.b;
                }
                o0w.x(b, context, null, j, null, str9, null, false, null, list2, null, null, null, null, "market_message", null, null, null, false, null, null, null, null, null, 1073733354);
                return;
            }
            return;
        }
        if (action instanceof ActionShareUrl) {
            boolean z = ((ActionShareUrl) action).d;
            if (!(newsEntry2 instanceof Videos)) {
                if (newsEntry2 instanceof NewsEntryWithAttachments) {
                    kbj0.e(nr4.b(), context, ((NewsEntryWithAttachments) newsEntry2).Ib(), z, null, false, null, 56);
                    return;
                } else {
                    kbj0.e(nr4.b(), context, newsEntry2, z, null, false, null, 56);
                    return;
                }
            }
            Videos videos = (Videos) newsEntry2;
            Attachment R1 = videos.R1();
            VideoAttachment videoAttachment = R1 instanceof VideoAttachment ? (VideoAttachment) R1 : null;
            VideoFile videoFile = videoAttachment != null ? videoAttachment.k : null;
            if (videoFile != null) {
                kbj0.u(nr4.b(), context, videoFile, false, z, null, null, 52);
                return;
            }
            kbj0 b2 = nr4.b();
            List<EntryAttachment> list3 = videos.u;
            ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((EntryAttachment) it.next()).b);
            }
            kbj0.e(b2, context, arrayList, z, null, false, null, 56);
            return;
        }
        NewsEntry newsEntry3 = newsEntry2;
        if (action instanceof ActionCloseWebApp) {
            qr.d(ce60.b, 100, newsEntry3);
            return;
        }
        if (action instanceof ActionShowSnackbar) {
            ActionShowSnackbar actionShowSnackbar = (ActionShowSnackbar) action;
            Integer valueOf = epx.f(actionShowSnackbar.d.a, "error_circle_outline") ? Integer.valueOf(R.drawable.vk_icon_error_circle_outline_24) : null;
            Integer valueOf2 = epx.f(actionShowSnackbar.d.b, "icon_negative") ? Integer.valueOf(R.attr.vk_ui_icon_negative) : null;
            ikv0.a aVar = new ikv0.a(context);
            if (valueOf != null) {
                aVar.t = new ikv0.c.C3058c(valueOf.intValue(), valueOf2, (Size) null, 12);
            }
            aVar.u = new ikv0.d(actionShowSnackbar.c, (String) null, (ikv0.d.a) null, 6);
            aVar.n();
            return;
        }
        if (action instanceof ActionOpenConversation) {
            ActionOpenConversation actionOpenConversation = (ActionOpenConversation) action;
            if (actionOpenConversation.c != 0) {
                o0w b3 = g2v.c().b();
                long j2 = actionOpenConversation.c;
                String str10 = str6 == null ? "" : str6;
                if (list2 == null) {
                    list2 = EmptyList.b;
                }
                o0w.x(b3, context, null, j2, null, str10, null, false, null, list2, null, null, null, null, "post_write_author", null, null, null, false, null, null, null, null, null, 1073733354);
            }
        }
    }
}
