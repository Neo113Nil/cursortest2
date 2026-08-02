package io.radar.sdk;

import android.app.ApplicationStartInfo;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaRecorder;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.attribute.BasicFileAttributeView;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class RadarLogger$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ ApplicationStartInfo m(Object obj) {
        return (ApplicationStartInfo) obj;
    }

    public static /* synthetic */ SurfaceTexture m(boolean z) {
        return new SurfaceTexture(z);
    }

    public static /* synthetic */ MediaRecorder m(Context context) {
        return new MediaRecorder(context);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m13274m() {
        return BasicFileAttributeView.class;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ DirectoryStream m13278m(Object obj) {
        return (DirectoryStream) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ FileSystemException m13281m(Object obj) {
        return (FileSystemException) obj;
    }

    public static /* synthetic */ FileSystemException m(String str) {
        return new FileSystemException(str);
    }

    public static /* synthetic */ FileSystemException m(String str, String str2, String str3) {
        return new FileSystemException(str, str2, str3);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ FileSystemLoopException m13282m(String str) {
        return new FileSystemLoopException(str);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ FileVisitResult m13285m(Object obj) {
        return (FileVisitResult) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ FileVisitor m13286m(Object obj) {
        return (FileVisitor) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ NoSuchFileException m13288m(String str, String str2, String str3) {
        return new NoSuchFileException(str, str2, str3);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Path m13289m(Object obj) {
        return (Path) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ SecureDirectoryStream m13291m(Object obj) {
        return (SecureDirectoryStream) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ BasicFileAttributeView m13293m(Object obj) {
        return (BasicFileAttributeView) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m13295m() {
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m13297m(Object obj) {
        return obj instanceof SecureDirectoryStream;
    }

    /* renamed from: m$1, reason: collision with other method in class */
    public static /* synthetic */ void m13303m$1() {
    }

    public static /* synthetic */ void m$2() {
    }

    public static /* synthetic */ void m$3() {
    }
}
