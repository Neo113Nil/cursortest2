package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import defpackage.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import okio.ByteString;
import xsna.bpn0;
import xsna.c5g;

/* compiled from: AndroidGetIsAdActivity.kt */
/* loaded from: classes14.dex */
public final class AndroidGetIsAdActivity {
    private final Lazy activities$delegate = new bpn0(new k(this, 4));
    private final SessionRepository sessionRepository;

    public AndroidGetIsAdActivity(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List activities_delegate$lambda$1(AndroidGetIsAdActivity androidGetIsAdActivity) {
        List<ByteString> observableAndroidActivitiesList = androidGetIsAdActivity.sessionRepository.getNativeConfiguration().getObservableAndroidActivitiesList();
        ArrayList arrayList = new ArrayList(c5g.u(observableAndroidActivitiesList, 10));
        Iterator<T> it = observableAndroidActivitiesList.iterator();
        while (it.hasNext()) {
            byte[] byteArray = ((ByteString) it.next()).toByteArray();
            byte[] copyOf = Arrays.copyOf(byteArray, byteArray.length);
            arrayList.add(new okio.ByteString(Arrays.copyOf(copyOf, copyOf.length)));
        }
        return arrayList;
    }

    private final List<okio.ByteString> getActivities() {
        return (List) this.activities$delegate.getValue();
    }

    public final boolean invoke(String str) {
        return getActivities().contains(ByteString.a.a(StringExtensionsKt.getSHA256Hash(str)));
    }
}
