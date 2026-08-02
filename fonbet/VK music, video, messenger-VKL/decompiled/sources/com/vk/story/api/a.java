package com.vk.story.api;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.api.LoadContext;

/* compiled from: StorySettings.java */
/* loaded from: classes6.dex */
public final class a {
    public int d;
    public MobileOfficialAppsConStoriesStat$ViewEntryPoint e;
    public boolean f;
    public String g;
    public LoadContext b = LoadContext.Story.b;
    public boolean c = false;

    @Nullable
    public Integer h = null;

    @NonNull
    public String a = "";

    public static String a(@Nullable String str) {
        return str == null ? "" : (str.equals("open_replies") || str.equals("open_miniapp_popup")) ? str : "";
    }

    public static a b(Intent intent) {
        a aVar;
        String stringExtra = intent.getStringExtra("story_action");
        if (stringExtra != null) {
            aVar = new a();
            aVar.b = LoadContext.Story.b;
            aVar.c = false;
            aVar.h = null;
            aVar.a = stringExtra;
        } else {
            aVar = new a();
        }
        intent.getBooleanExtra("show_back_to_stories_button", false);
        aVar.b = (LoadContext) intent.getParcelableExtra("load_context");
        return aVar;
    }
}
