package okio;

import java.nio.file.FileVisitOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class NioSystemFileSystem$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ Class m() {
        return FileAttributeView.class;
    }

    public static /* synthetic */ NoSuchFileException m(String str) {
        return new NoSuchFileException(str);
    }

    public static /* bridge */ /* synthetic */ AclFileAttributeView m(Object obj) {
        return (AclFileAttributeView) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ BasicFileAttributes m15298m(Object obj) {
        return (BasicFileAttributes) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ DosFileAttributeView m15299m(Object obj) {
        return (DosFileAttributeView) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ FileAttributeView m15300m(Object obj) {
        return (FileAttributeView) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ PosixFileAttributeView m15302m(Object obj) {
        return (PosixFileAttributeView) obj;
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return AclFileAttributeView.class;
    }

    public static /* bridge */ /* synthetic */ Class m$2() {
        return DosFileAttributeView.class;
    }

    public static /* bridge */ /* synthetic */ Class m$3() {
        return PosixFileAttributeView.class;
    }

    public static /* bridge */ /* synthetic */ Class m$4() {
        return FileVisitOption.class;
    }
}
