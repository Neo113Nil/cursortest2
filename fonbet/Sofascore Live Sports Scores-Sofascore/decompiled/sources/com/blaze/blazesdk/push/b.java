package com.blaze.blazesdk.push;

import com.blaze.blazesdk.push.ExtraInfoModel;
import com.blaze.blazesdk.push.ExtraInfoType;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.google.gson.Gson;
import defpackage.evl;
import defpackage.ndd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b {
    public static final b a = new b();

    public final ExtraInfoType a(String str) {
        str.getClass();
        try {
            ExtraInfoModel extraInfoModel = (ExtraInfoModel) new Gson().fromJson(str, ExtraInfoModel.class);
            ExtraInfoModel.ContentType type = extraInfoModel.getType();
            int i = type == null ? -1 : a.a[type.ordinal()];
            if (i == -1) {
                evl.m(this);
                return null;
            }
            if (i == 1) {
                String pageId = extraInfoModel.getPageId();
                return pageId != null ? new ExtraInfoType.StoryPage(extraInfoModel.getId(), pageId, extraInfoModel.getEventId(), extraInfoModel.getLabel()) : new ExtraInfoType.Story(extraInfoModel.getId(), extraInfoModel.getEventId(), extraInfoModel.getLabel());
            }
            if (i == 2) {
                return new ExtraInfoType.Moment(extraInfoModel.getId(), extraInfoModel.getEventId(), extraInfoModel.getLabel());
            }
            if (i == 3) {
                return new ExtraInfoType.Video(extraInfoModel.getId(), extraInfoModel.getEventId(), extraInfoModel.getLabel());
            }
            throw new ndd();
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return null;
        }
    }
}
