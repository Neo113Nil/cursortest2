package com.vk.superapp.ui.miniapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.core.preference.Preference;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import xsna.a0a;
import xsna.e43;
import xsna.er;
import xsna.jgr0;
import xsna.svv0;

/* compiled from: EventsAppFragment.kt */
/* loaded from: classes6.dex */
public final class EventsAppFragment extends VKSuperAppBrowserFragment {
    public static final long a0 = InternalVkMiniApps.EVENTS_CATALOG.h().a;

    /* compiled from: EventsAppFragment.kt */
    public static final class a extends jgr0 {
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, xsna.ok8
    public final svv0 ln(Bundle bundle) {
        Uri.Builder a2 = er.a(HttpRequest.DEFAULT_SCHEME);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        Uri.Builder appendEncodedPath = a2.authority(Preference.g(context).getString("vkUiHostUri", "static.".concat(a0a.d))).appendPath("events").appendEncodedPath("");
        String string = bundle.getString("ref");
        if (string != null && string.length() != 0) {
            appendEncodedPath.appendQueryParameter("ref", string);
        }
        return new svv0.b(appendEncodedPath.build().toString(), InternalVkMiniApps.EVENTS_CATALOG.h().a, false, null, false, false, 252);
    }
}
