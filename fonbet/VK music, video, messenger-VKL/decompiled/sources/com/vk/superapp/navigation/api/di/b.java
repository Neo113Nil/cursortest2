package com.vk.superapp.navigation.api.di;

import com.vk.external.miniapp.net.personal.BannerType;
import com.vk.superapp.bridges.advertisement.AdRequestEvent;
import com.vk.superapp.bridges.advertisement.BannerParamsSnapshot;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import com.vk.superapp.navigation.api.data.AppShareType;
import org.json.JSONObject;
import xsna.cnk;
import xsna.h16;
import xsna.s31;

/* compiled from: VkAnalyticsFactory.kt */
/* loaded from: classes6.dex */
public final class b implements VkBridgeAnalytics {
    @Override // com.vk.superapp.navigation.api.VkBridgeAnalytics
    public final void b(AdRequestEvent adRequestEvent) {
    }

    @Override // com.vk.superapp.navigation.api.VkBridgeAnalytics
    public final void c(cnk cnkVar) {
    }

    @Override // com.vk.superapp.navigation.api.VkBridgeAnalytics
    public final void g(VkBridgeAnalytics.RegistrationEvent registrationEvent) {
    }

    @Override // com.vk.superapp.navigation.api.VkBridgeAnalytics
    public final void j(VkBridgeAnalytics.InstallScreenEvent installScreenEvent) {
    }

    @Override // com.vk.superapp.navigation.api.VkBridgeAnalytics
    public final void k(String str, AppShareType appShareType) {
    }

    @Override // com.vk.superapp.navigation.api.VkBridgeAnalytics
    public final void l(VkBridgeAnalytics.PersonalDiscountEvent personalDiscountEvent, BannerType bannerType) {
    }

    @Override // com.vk.superapp.navigation.api.VkBridgeAnalytics
    public final void m(VkBridgeAnalytics.ExitGameAlertEvent exitGameAlertEvent, Integer num) {
    }

    @Override // com.vk.superapp.navigation.api.VkBridgeAnalytics
    public final void e(boolean z, s31 s31Var, VkBridgeAnalytics.NativeAdEventType nativeAdEventType) {
    }

    @Override // com.vk.superapp.navigation.api.VkBridgeAnalytics
    public final void i(String str, String str2, JSONObject jSONObject) {
    }

    @Override // com.vk.superapp.navigation.api.VkBridgeAnalytics
    public final void d(VkBridgeAnalytics.PersonalDiscountExitReason personalDiscountExitReason, int i, Integer num, BannerType bannerType) {
    }

    @Override // com.vk.superapp.navigation.api.VkBridgeAnalytics
    public final void h(VkBridgeAnalytics.ExitGameAlertEvent exitGameAlertEvent, Integer num, String[] strArr, Integer num2) {
    }

    @Override // com.vk.superapp.navigation.api.VkBridgeAnalytics
    public final void a(VkBridgeAnalytics.BannerAdEvent bannerAdEvent, boolean z, h16 h16Var, BannerParamsSnapshot bannerParamsSnapshot, String str) {
    }

    @Override // com.vk.superapp.navigation.api.VkBridgeAnalytics
    public final void f(String str, boolean z, s31 s31Var, VkBridgeAnalytics.NativeAdEventType nativeAdEventType, String str2) {
    }
}
