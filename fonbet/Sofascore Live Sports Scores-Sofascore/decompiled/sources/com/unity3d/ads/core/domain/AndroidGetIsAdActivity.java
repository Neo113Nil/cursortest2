package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import defpackage.gc2;
import defpackage.joa;
import defpackage.k13;
import defpackage.q1f;
import defpackage.ypa;
import defpackage.z0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR)\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetIsAdActivity;", "", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "", "activityName", "", "invoke", "(Ljava/lang/String;)Z", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "", "Lgc2;", "kotlin.jvm.PlatformType", "activities$delegate", "Ljoa;", "getActivities", "()Ljava/util/List;", "activities", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidGetIsAdActivity {

    /* renamed from: activities$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa activities;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidGetIsAdActivity(@NotNull SessionRepository sessionRepository) {
        sessionRepository.getClass();
        this.sessionRepository = sessionRepository;
        this.activities = ypa.b(new z0(this, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List activities_delegate$lambda$1(AndroidGetIsAdActivity androidGetIsAdActivity) {
        List<ByteString> observableAndroidActivitiesList = androidGetIsAdActivity.sessionRepository.getNativeConfiguration().getObservableAndroidActivitiesList();
        observableAndroidActivitiesList.getClass();
        ArrayList arrayList = new ArrayList(k13.r(observableAndroidActivitiesList, 10));
        Iterator<T> it = observableAndroidActivitiesList.iterator();
        while (it.hasNext()) {
            byte[] byteArray = ((ByteString) it.next()).toByteArray();
            byte[] copyOf = Arrays.copyOf(byteArray, byteArray.length);
            gc2 gc2Var = gc2.d;
            arrayList.add(q1f.r(copyOf));
        }
        return arrayList;
    }

    private final List<gc2> getActivities() {
        return (List) this.activities.getValue();
    }

    public final boolean invoke(@NotNull String activityName) {
        activityName.getClass();
        String sHA256Hash = StringExtensionsKt.getSHA256Hash(activityName);
        gc2 gc2Var = gc2.d;
        return getActivities().contains(q1f.m(sHA256Hash));
    }
}
